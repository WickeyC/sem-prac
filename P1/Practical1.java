import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox; //dropdown
import javax.swing.JFrame; //form
import javax.swing.JLabel; //messages
import javax.swing.JTextField;
//awt = older UI, swing = based on awt

public class Practical1 extends JFrame implements ItemListener {

	FlowLayout layout = new FlowLayout(); // Fixed, Grid, Flow
	JComboBox<String> fruitbox = new JComboBox<>();
	JComboBox<String> herobox = new JComboBox<>();
	JLabel fruitlist = new JLabel("Fruit List");
	JLabel herolist = new JLabel("Hero List");
	JLabel selectEvent = new JLabel("Price will be shown in the text box for the selected fruit");
	JLabel heroEvent = new JLabel("Score will be shown in the text box for the selected hero");
	JTextField fruitprice = new JTextField(20);
	JTextField heroscore = new JTextField(20);

	int[] listprice = { 10, 9, 6, 12 };
	int[] listscore = { 95, 85, 90, 80 };
	int totalprice = 0;
	int score = 0;

	String output;
	int SelectNum;

	public Practical1() {
		JFrame frame = new JFrame("Practical1");
		Container mypane = frame.getContentPane();

		mypane.setLayout(layout);
		mypane.add(fruitlist);
		fruitbox.addItemListener(this);
		fruitbox.addItem("Orange");
		fruitbox.addItem("Apple");
		fruitbox.addItem("Banana");
		fruitbox.addItem("Berries");
		mypane.add(fruitbox);

		mypane.add(selectEvent);
		mypane.add(fruitprice);

		mypane.add(herolist);
		herobox.addItemListener(this);
		herobox.addItem("Superman");
		herobox.addItem("My Lecturer");
		herobox.addItem("My Tutor");
		herobox.addItem("Myself");
		mypane.add(herobox);

		mypane.add(heroEvent);
		mypane.add(heroscore);

		frame.setSize(710, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Practical1();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();

		if (source == fruitbox) {
			int choice = fruitbox.getSelectedIndex();
			totalprice = listprice[choice];
			output = "The fruit price is " + totalprice;
			fruitprice.setText(output);
		} else if (source == herobox) {
			int choice = herobox.getSelectedIndex();
			score = listscore[choice];
			output = "The hero score is " + score;
			heroscore.setText(output);
		}
	}
}
