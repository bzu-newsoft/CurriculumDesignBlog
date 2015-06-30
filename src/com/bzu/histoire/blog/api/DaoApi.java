package com.bzu.histoire.blog.api;

import java.sql.Timestamp;
import java.util.List;

import com.bzu.histoire.blog.dao.impl.BackgroundAcrticleImpl;
import com.bzu.histoire.blog.pojo.Acrticle;
import com.bzu.histoire.blog.pojo.Acrticletype;
import com.bzu.histoire.blog.pojo.Images;
import com.bzu.histoire.blog.pojo.Member;
import com.bzu.histoire.blog.pojo.Message;

public class DaoApi {
	public static java.sql.Date datetime=new java.sql.Date(new java.util.Date().getTime());
	public static Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	
	public static Acrticle acrticle = new Acrticle(9,"demo8","demo7.jsp",timestamp,"blog");
	public static Acrticletype acrticletype = new Acrticletype(1,"publish","a");
	public static Images images = new Images(1,"helloimages", "www.sina.com", "helloinages");
	public static Member member = new Member(1,"admin", "123");
	public static Message message = new Message(1,"hellomessage", timestamp, "vistor", "vistor@vistor.com");
	
	public static String returnprice;
	public static Acrticle returnacrticle;
	public static Acrticletype returnacrticletype; 
	public static Images returnimages; 
	public static Member returnmember; 
	public static Message returnmessage; 
	
	public static List<Acrticle> listacrticle;
	public static List<Acrticletype> listacrticletype; 
	public static List<Images> listimages; 
	public static List<Member> listmember; 
	public static List<Message> listmessage; 
	
	public static void main(String[] args) {
		new DaoApi().backgroundAcrticleImpl();;
	}
	
	public void backgroundAcrticleImpl(){

		BackgroundAcrticleImpl backgroundAcrticleImpl = new BackgroundAcrticleImpl();
		
//		returnprice = backgroundAcrticleImpl.InsertAcrticle(acrticle);
//		System.out.println("backgroundAcrticleImpl.InsertAcrticle:" + returnprice);
		
//		Acrticle acrticleDelete = new Acrticle();
//		acrticleDelete.setId(8);
//		returnprice = backgroundAcrticleImpl.DeleteAcrticle(acrticleDelete);
//		System.out.println("backgroundAcrticleImpl.DeleteAcrticle:" + returnprice);
		
		returnprice = backgroundAcrticleImpl.UpdateAcrticle(acrticle);
		System.out.println("backgroundAcrticleImpl.UpdateAcrticle:" + returnprice);
		
//		returnacrticle = backgroundAcrticleImpl.SelectOneAcrticle(acrticle);
//		System.out.println("backgroundAcrticleImpl.SelectOneAcrticle:" + 
//							"  Id:" + returnacrticle.getId() + 
//							"  Title:" + returnacrticle.getTitle() +
//							"  Path:" + returnacrticle.getPath() + 
//							"  Time:" + returnacrticle.getAddTime() + 
//							"  Acrticletype:" + returnacrticle.getAcrticletype()
//						);
//		
//		returnprice = backgroundAcrticleImpl.DeleteAcrticle(returnacrticle);
//		System.out.println("backgroundAcrticleImpl.DeleteAcrticle:" + returnprice);

		
//		listacrticle = backgroundAcrticleImpl.SelectAllAcrticle();
//		for(int i = 0; i < listacrticle.size(); i++){
//			System.out.println("backgroundAcrticleImpl.SelectOneAcrticle:" + 
//					"  Id:" + listacrticle.get(i).getId() + 
//					"  Title:" + listacrticle.get(i).getTitle() +
//					"  Path:" + listacrticle.get(i).getPath() + 
//					"  Time:" + listacrticle.get(i).getAddTime() + 
//					"  Acrticletype:" + listacrticle.get(i).getAcrticletype()
//				);
//		}
		
	}
}
