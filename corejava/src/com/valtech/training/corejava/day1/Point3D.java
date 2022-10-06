package com.valtech.training.corejava.day1;

public class Point3D extends Point {
	
	public static final Point3D ORIGIN =new Point3D ();
	
	private int z;

	public int compareTo(Point3D o) {
		if(distance()< o.distance()) {
			return -1;
		}
		if (distance()== o.distance()) {
			if(x<o.x) {
				return -1;
			}
			if(x>o.x) {
				return +1;
			}
			return 0;
		}
		
		return +1;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Point3D) {
			Point3D p= (Point3D) obj;
			return p.x==x && p.y==y && p.z==z;
		}
		
		return false;
		
	}
	public int hashCode() {
		return toString().hashCode();
	}
	
	public String toString() {
		return new StringBuffer("X=").append(x).append("Y=").append(y).append("Z=").append(z).toString();
	}
	
	public Point3D() {
		
	}
	
	public Point3D(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	
     public double distance() {
    	 return Math.sqrt(x*x+y*y+z*z);
    	 
     }
     
     public double distance(int x,int y, int z) {
    	 int dx=this.x-x;
    	 int dy=this.y-y;
    	 int dz=this.z-z;
    	 return Math.sqrt(dx*dx+dy*dy+dz*dz);
     }
     
     public double distance(Point3D p) {
    	 return distance(p.x,p.y,p.z);
     }
	
	public int getZ() {
		return z;
	}



	public void setZ(int z) {
		this.z = z;
	}

	


	public static void main(String[] args) {
		System.out.println(new Point3D());
		Point p =new Point3D(10,20,30);
		System.out.println(p.distance());
		
	}

}
