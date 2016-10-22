package de.germanspacebuild.gatesim.gui;

import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryUtil;

import static org.lwjgl.glfw.GLFW.*;

/**
 * Created by Felix on 11.10.2016
 * for GateSim
 *
 * @author Felix
 */
public class DisplayManager {

    public static long windowID;
    public static GLFWErrorCallback errorCallback;

    public static void createDisplay() {

        glfwInit();
        errorCallback = GLFWErrorCallback.createPrint(System.err);
        glfwSetErrorCallback(errorCallback);

        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 3);
        glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        windowID = glfwCreateWindow(1280, 720, "GateSim", MemoryUtil.NULL, MemoryUtil.NULL);

        if (windowID == MemoryUtil.NULL) {
            throw new RuntimeException("Failed to create windowID");
        }

        glfwMakeContextCurrent(windowID);
        GL.createCapabilities();
        glfwShowWindow(windowID);

    }

    public static void updateDisplay() {
        glfwPollEvents();
        glfwSwapBuffers(windowID);
        glfwSwapInterval(1);
    }

    public static void closeDisplay() {
        glfwDestroyWindow(windowID);
    }

}
