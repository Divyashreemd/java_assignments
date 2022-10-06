package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point;
import com.valtech.training.corejava.day1.Point3D;

public class Point3DSetTest {
	
	

	@Test
	public void testSetOfPoints3D() {
		Set<Point3D> points = new HashSet<>();
		points.add(new Point3D(2,3,4));
		assertEquals(1,points.size());
		points.add(new Point3D(2,3,4));
		assertEquals(1,points.size());
		points.add(new Point3D(4,3,4));
		assertEquals(2,points.size());
		
		
	}
}
