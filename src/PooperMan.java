import static org.lwjgl.glfw.GLFW.*;

public class PooperMan {

	public static void main(String[] args) {
		glfwInit();
		
		long win = glfwCreateWindow(640, 480, "RainbowMan", 0, 0);
		
		glfwShowWindow(win);
		
		while(!glfwWindowShouldClose(win)) {
			glfwPollEvents();
		}
	}
}