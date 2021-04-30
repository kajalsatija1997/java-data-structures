package Lecture_24;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TTT extends JFrame implements ActionListener {
	public static final int BOARD_SIZE = 3;

	private static enum GameStatus {
		Xwins, Zwins, Incomplete, Tie
	}

	private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
	boolean crossTurn = true;

	TTT() {
		super.setSize(800, 800);
		super.setTitle("Tic Tac Toe");
		GridLayout grid = new GridLayout(BOARD_SIZE, BOARD_SIZE);
		super.setLayout(grid);
		Font font = new Font("Comic Sans", 1, 150);
		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				JButton button = new JButton("");
				buttons[i][j] = button;
				button.setFont(font);
				button.addActionListener(this);
				super.add(button);
			}
		}
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clickedButton = (JButton) e.getSource();
		makeMove(clickedButton);
		GameStatus gs = getGameStatus();
		if (gs == GameStatus.Incomplete) {
			return;
		}
		declareWinner(gs);
		int input = JOptionPane.showConfirmDialog(this, "Would You Like to Restart");
		if (input == JOptionPane.YES_OPTION) {
			for (int i = 0; i < BOARD_SIZE; i++) {
				for (int j = 0; j < BOARD_SIZE; j++) {
					buttons[i][j].setText("");
				}
			}
			crossTurn = true;

		} else {
			super.dispose();
		}

	}

	private void makeMove(JButton clickedButton) {
		String buttonText = clickedButton.getText();
		if (buttonText.length() > 0) {
			JOptionPane.showMessageDialog(this, "Invalid Move");
			return;
		}
		if (crossTurn) {
			clickedButton.setText("X");
		} else {
			clickedButton.setText("0");
		}
		crossTurn = !crossTurn;
	}

	private GameStatus getGameStatus() {
		String text1 = "", text2 = "";
		int row = 0, col = 0;

		while (row < BOARD_SIZE) {
			col = 0;
			while (col < BOARD_SIZE - 1) {
				text1 = buttons[row][col].getText();
				text2 = buttons[row][col + 1].getText();
				if (text1 == "" || text2 == "" || !text1.equals(text2)) {
					break;
				}
				col++;
			}
			if (col == BOARD_SIZE - 1) {
				String winner = buttons[row][col].getText();
				if (winner.equals("X")) {
					return GameStatus.Xwins;
				} else {
					return GameStatus.Zwins;
				}
			}
			row++;
		}

		row = 0;
		col = 0;

		while (col < BOARD_SIZE) {
			row = 0;
			while (row < BOARD_SIZE - 1) {
				text1 = buttons[row][col].getText();
				text2 = buttons[row + 1][col].getText();
				if (text1 == "" || text2 == "" || !text1.equals(text2)) {
					break;
				}
				row++;
			}
			if (row == BOARD_SIZE - 1) {
				String winner = buttons[row][col].getText();
				if (winner.equals("X")) {
					return GameStatus.Xwins;
				} else {
					return GameStatus.Zwins;
				}
			}
			col++;
		}

		row = 0;
		col = 0;
		while (row < BOARD_SIZE - 1) {
			text1 = buttons[row][col].getText();
			text2 = buttons[row + 1][col + 1].getText();
			if (text1 == "" || text2 == "" || !text1.equals(text2)) {
				break;
			}
			row++;
			col++;
		}
		if (row == BOARD_SIZE - 1) {
			String winner = buttons[row][col].getText();
			if (winner.equals("X")) {
				return GameStatus.Xwins;
			} else {
				return GameStatus.Zwins;
			}
		}

		row = BOARD_SIZE - 1;
		col = 0;
		while (row > 0) {
			text1 = buttons[row][col].getText();
			text2 = buttons[row - 1][col + 1].getText();
			if (text1 == "" || text2 == "" || !text1.equals(text2)) {
				break;
			}
			row--;
			col++;
		}
		if (row == 0) {
			String winner = buttons[row][col].getText();
			if (winner.equals("X")) {
				return GameStatus.Xwins;
			} else {
				return GameStatus.Zwins;
			}
		}

		for (int i = 0; i < BOARD_SIZE; i++) {
			for (int j = 0; j < BOARD_SIZE; j++) {
				String text = buttons[i][j].getText();
				if (text.length() == 0) {
					return GameStatus.Incomplete;
				}
			}
		}

		return GameStatus.Tie;

	}

	private void declareWinner(GameStatus gs) {
		if (gs == GameStatus.Xwins) {
			JOptionPane.showMessageDialog(this, "XWins");
		} else if (gs == GameStatus.Zwins) {
			JOptionPane.showMessageDialog(this, "ZWins");
		} else {
			JOptionPane.showMessageDialog(this, "It's a tie");

		}
	}

}
