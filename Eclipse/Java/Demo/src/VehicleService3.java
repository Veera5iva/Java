import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Program VehicleService.java, using array list instead of HashMap

class VehicleNotFoundException extends Exception{
   
	private static final long serialVersionUID = 1L;

	public VehicleNotFoundException(String msg){
        super("Vehicle Not Found : "+msg);
    }
}
class Vehicle{
    String regNumber;
    String vehicleType;
    String vehicleMake;
    String ownerContactNumber;
    String serviceCost;
    Vehicle(){

    }

    public Vehicle(String regNumber){
	this.regNumber = regNumber;
    }

    public Vehicle(String regNumber, String vehicleType, String vehicleMake, String ownerContactNumber, String serviceCost){
        this.regNumber = regNumber;
        this.vehicleType = vehicleType;
        this.vehicleMake = vehicleMake;
        this.ownerContactNumber = ownerContactNumber;
        this.serviceCost = serviceCost;

    }

    public String toString(){
        return "["+this.regNumber+"-"+
                    this.vehicleType+" - "+this.vehicleMake+" - "+
                    this.ownerContactNumber+" - "+this.serviceCost+"]";
    }

//    public int hashCode(){
//        return this.regNumber.hashCode();
//    } 
//    public boolean equals(Object obj){
//        Vehicle v=(Vehicle)obj;
//        return this.regNumber.equals(v.regNumber);
//    }

//    @Override
//    public int compareTo(Vehicle v) {
//        if(this.serviceCost<v.serviceCost){
//            return 1;
//        }else if(this.serviceCost > v.serviceCost){
//            return -1;
//        }
//        return 0;
//    }
}


public class VehicleService3 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JLabel l1, l2, l3, l4,l5, l6;
    JTextField tfRegNum,tfVehMake,tfOwnerContNum, tfServCost; 
    JComboBox<String> jcVehType;
    JButton jbAdd, jbSearch, jbList;
    JTextArea jta;
    private ArrayList<Vehicle> vehiclesList = new ArrayList<Vehicle>();

    public VehicleService3(){
        super("First Frame");
        this.setSize(800,800);
        // Label Creation
        
        l1 = new JLabel("Registration Number");
        l2 = new JLabel("Vehicle Type");
        l3 = new JLabel("Vehicle Make");
        l4 = new JLabel("Owner Contact Number");
        l5 = new JLabel("Service Cost");
        
        // Text Field and Combo Box Creation
        
        tfRegNum = new JTextField(20);
        tfVehMake = new JTextField(20);
        tfOwnerContNum = new JTextField(20);
        tfServCost = new JTextField(20);
        String vType[]= {"Two Wheeler", "Four Wheeler"};
        jcVehType = new JComboBox<String>(vType);
        jta = new JTextArea(50,400);
        // Button Creation
        
        jbAdd = new JButton("Add Service");
        jbSearch = new JButton("Get Service Cost");
        jbList = new JButton("List All Vehicles");
        
        JLabel title = new JLabel("Vehicle Service Management System");
        
        title.setBounds(250,50,500,30);
        
        l1.setBounds(20,100,200,30);
        tfRegNum.setBounds(160,100,200,30);
        
        l2.setBounds(20,150,200,30);
        jcVehType.setBounds(160,150,200,30);
        
        l3.setBounds(20,200,200,30);
        tfVehMake.setBounds(160,200,200,30);
        
        l4.setBounds(20,250,200,30);
        tfOwnerContNum.setBounds(160,250,200,30);
        
        l5.setBounds(20,300,200,30);
        tfServCost.setBounds(160,300,200,30);
        
        jta.setBounds(20,400,600,200);
       
        jbAdd.setBounds(20,350,150,30);
        jbSearch.setBounds(200,350,150,30);
        jbList.setBounds(380,350,150,30);
        
        
        jbAdd.addActionListener(this);
        jbSearch.addActionListener(this);
        jbList.addActionListener(this);
        
        this.setLayout(null);
        
        this.add(title);
        this.add(l1);
        this.add(tfRegNum);
        
        this.add(l2);
        this.add(jcVehType);
        
        this.add(l3);
        this.add(tfVehMake);
        
        this.add(l4);
        this.add(tfOwnerContNum);
        
        this.add(l5);
        this.add(tfServCost);
        
        this.add(jbAdd);
        this.add(jbSearch);
        this.add(jbList);
        
        this.add(jta);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
 
    public void actionPerformed(ActionEvent ae){
    	String cmd=ae.getActionCommand();
    	try {
    	if(ae.getSource()==jbAdd) {
    		String regNo = tfRegNum.getText();
    		String vType = jcVehType.getSelectedItem().toString();
    		String vMake = tfVehMake.getText();
    		String contNum = tfOwnerContNum.getText();
    		String servCost = tfServCost.getText();
		
    		Vehicle v=new Vehicle(regNo, vType, vMake, contNum, servCost);
	        vehiclesList.add(v);

    		JOptionPane.showMessageDialog(this, "Service Details Added Successfully");
    	}else if(cmd.equalsIgnoreCase("Get Service Cost")) {
    		String regNo = JOptionPane.showInputDialog("Enter Vehicle Registration Number ");
	        Vehicle v=new Vehicle(regNo);
	       	if(vehiclesList.contains(v)){
			int index = vehiclesList.indexOf(v);
			v = vehiclesList.get(index);
		}else
                	throw new VehicleNotFoundException(regNo);    
        	
    		String servCost = v.serviceCost;
    		JOptionPane.showMessageDialog(this, "Service Cost : "+servCost);
    	}else if(cmd.equalsIgnoreCase("List All Vehicles")) {
        
		jta.setText("");
    		for(Vehicle v:vehiclesList) {
    			jta.append("\n"+v);
    		}
    	}
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(this, e.getMessage());
    	}
    }

    public static void main(String args[]){
    	new VehicleService3();
    }
}