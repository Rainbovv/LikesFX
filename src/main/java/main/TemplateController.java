package main;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
public class TemplateController {


	static ToolBar toolBar;
	static Label label;
	private static double likes = 996;


	public static void setToolBar(ToolBar bar) {
		toolBar = bar;
		label = (Label)toolBar.getItems().get(0);
		label.setText(likesToString(likes));
	}

	public void incrementLikes() {
		likes++;
		label.setText(likesToString(likes));
	}

	private static String likesToString(double likes) {
		if (999 < likes && likes < 1000000) return String.format("%.1fK", likes / 1000);
		if (999999 < likes && likes < 1000000000) return String.format("%.1fM", likes / 1000000);
		if (999999999 < likes && likes < 1000000000000L) return String.format("%.1fG", likes / 1000000000);

		return String.format("%.0f", likes);
	}
}
