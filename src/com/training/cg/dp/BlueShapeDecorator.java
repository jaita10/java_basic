package com.training.cg.dp;

public class BlueShapeDecorator extends ShapeDecorator{
	
	public BlueShapeDecorator (Shape decoratedShape) {
		super(decoratedShape);
		
	}
	
	@Override
	public void draw() {
		
		decoratedShape.draw();
		setBlueborder(decoratedShape);
		
	}
	
	private void setBlueborder(Shape decoratedShape) {
		System.out.println("Shape border color : Blue");
	}

}
