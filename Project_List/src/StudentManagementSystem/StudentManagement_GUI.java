package StudentManagementSystem;

import java.sql.*;
import java.awt.*;
import javax.swing.*;

public class StudentManagement_GUI extends JFrame {

	Connection conn = DB_Con.DBC();
	Statement stmt = null;
	JTextArea ta1 = new JTextArea(12, 20);
	JTextField tf1 = new JTextField(15);
	
	ButtonGroup bg = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("학번", true);
	JRadioButton rb2 = new JRadioButton("이름");
	JRadioButton rb3 = new JRadioButton("학과");
	
	JTextField tf_id = new JTextField(20);
	JTextField tf_name = new JTextField(20);
	JTextField tf_dept = new JTextField(20);
	
	public StudentManagement_GUI() {
		
		setTitle("학생 관리 프로젝트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JPanel pa_id = new JPanel();
		JLabel la_id = new JLabel("학번");
		pa_id.add(la_id);
		pa_id.add(tf_id);
		c.add(pa_id);
		
		JPanel pa_name = new JPanel();
		JLabel la_name = new JLabel("이름");
		pa_name.add(la_name);
		pa_name.add(tf_name);
		c.add(pa_name);
		
		JPanel pa_dept = new JPanel();
		JLabel la_dept = new JLabel("학과");
		pa_dept.add(la_dept);
		pa_dept.add(tf_dept);
		c.add(pa_dept);
		
		JPanel pa_button = new JPanel();
		JButton btn1 = new JButton("입력");
		btn1.addActionListener(e -> {
			dbInsert(tf_id.getText(), tf_name.getText(), tf_dept.getText());
		});
		pa_button.add(btn1);
		
		JButton btn2 = new JButton("수정");
		btn2.addActionListener(e -> {
			dbUpdate(tf_id.getText(), tf_name.getText(), tf_dept.getText());
		});
		pa_button.add(btn2);
		
		JButton btn3 = new JButton("삭제");
		btn3.addActionListener(e -> {
			dbDelete(tf_name.getText());
		});
		pa_button.add(btn3);
		
		JButton btn4 = new JButton("조회");
		btn4.addActionListener(e -> {
			dbSearch();
		});
		pa_button.add(btn4);
		c.add(pa_button);
		
		JPanel pa1 = new JPanel();
		JButton bt1 = new JButton("검색");
		bt1.addActionListener(e -> {
			dbSelect();
		});
		pa1.add(tf1);
		pa1.add(bt1);
		c.add(pa1);
		
		JPanel pa2 = new JPanel();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		pa2.add(rb1);
		pa2.add(rb2);
		pa2.add(rb3);
		c.add(pa2);
		
		JPanel pa3 = new JPanel();
		pa3.add(ta1);
		c.add(pa3);
		
		setSize(300, 500);
		setVisible(true);
	}
	
	public void dbInsert(String id, String name, String dept) {
		try {
			stmt = conn.createStatement();
			String insertSql = "insert into Student(Sid, Sname, Sdept) values('" + id + "','" + name + "','" + dept + "');";
			stmt.executeUpdate(insertSql);
			tf_id.setText("");
			tf_name.setText("");
			tf_dept.setText("");
			System.out.println("입력 성공");
			stmt.close();
		} catch (SQLException e) {
			System.out.println("입력 에러");
			e.printStackTrace();
		}
	}
	
	public void dbUpdate(String id, String name, String dept) {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("update Student set Sdept = '" + dept + "', Sname = '" + name + "' where Sid = '" + id + "'");
			System.out.println(name + "수정 완료");
			tf_id.setText("");
			tf_name.setText("");
			tf_dept.setText("");
			stmt.close();
		} catch (Exception e) {
			System.out.println("수정 에러");
			e.printStackTrace();
		}
	}
	
	public void dbDelete(String id) {
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate("delete from Student where Sid = '" + id + "';");
			System.out.println("삭제 완료");
			tf_id.setText("");
			tf_name.setText("");
			tf_dept.setText("");
			stmt.close();
		} catch (Exception e) {
			System.out.println("삭제 에러");
			e.printStackTrace();
		}
	}
	
	public void dbSearch() {
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Student");
			ta1.setText("");
			ta1.append("--학번--이름--학과----------------------------------------\n");
			while(rs.next()) {
				String name = rs.getString("Sname");
				String dept = rs.getString("Sdept");
				String id = rs.getString("Sid");
				String line = " | " + id + " | " + name + " | " + dept + "\n";
				System.out.println("rs => " + line);
				ta1.append(line);
			}
			System.out.println("검색 성공 ");
			tf_id.setText("");
			tf_name.setText("");
			tf_dept.setText("");
			stmt.close();
		} catch (Exception e) {
			System.out.println("검색 에러");
			e.printStackTrace();
		}
	}
	
	public void dbSelect() {
	    try {
	        stmt = conn.createStatement();
	        String searchText = tf1.getText();
	        String searchSql = "";
	        if (rb1.isSelected()) {
	            searchSql = "SELECT * FROM Student WHERE Sid = '" + searchText + "';";
	        } else if (rb2.isSelected()) {
	            searchSql = "SELECT * FROM Student WHERE Sname = '" + searchText + "';";
	        } else {
	            searchSql = "SELECT * FROM Student WHERE Sdept = '" + searchText + "';";
	        }
	        ResultSet rs = stmt.executeQuery(searchSql);
	        ta1.setText("");
	        ta1.append("--학번--이름--학과----------------------------------------\n");
	        while (rs.next()) {
	            String name = rs.getString("Sname");
	            String dept = rs.getString("Sdept");
	            String id = rs.getString("Sid");
	            String line = " | " + id + " | " + name + " | " + dept + "\n";
	            System.out.println("rs => " + line);
	            ta1.append(line);
	        }
	        rs.close();
	        stmt.close();
	    } catch (SQLException e) {
	        System.out.println("검색 에러");
	        e.printStackTrace();
	    }
	}
	
}
