package com.auction.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.auction.db.DbManager;
import com.auction.entity.ItemImage;
import com.auction.factory.IDAO;

/**
 *
 * @author gp12-mvr2 group
 */

public class ImageDAO implements IDAO {
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T> int merge(T obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <T> int save(T obj) {
		ItemImage itemImage =(ItemImage)obj;
		String sql="insert into ItemImages (listingid, image) values("
                        + itemImage.getListingId() + ",'"
			+ itemImage.getImagePath() +"')";
		return update(sql);
	}
	public int merge(String colname,String val,String id)
	{
		String sql="update ItemImages set "+ colname + " = '"+ val + "' where imageID =" + id + ";";
		return update(sql);
	}
	public  ItemImage queryItemImageByImageId(Integer imageId)
	{
		String sql="select * from ItemImages where imageid = "+ imageId + ";";
		return query(sql).get(0);
	}
        
        public  List<ItemImage> queryItemImageByListingId(Integer listingId)
	{
		String sql="select * from ItemImages where listingId = "+ listingId + ";";
		return query(sql);
	}
        
	private List<ItemImage> query(String sql)
	{
		DbManager db=new DbManager();
		List<ItemImage> list=new ArrayList<ItemImage>();
		ResultSet rs=db.getRs(sql);
		try {
			while(rs.next())
			{
				ItemImage itemImage = new ItemImage();
				itemImage.setImageId(rs.getInt("imageid"));
                                itemImage.setListingId(rs.getInt("listingid"));
				itemImage.setImagePath(rs.getString("image"));
				list.add(itemImage);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
            db.destory();
        }
		return list;
	}
	private int update(String sql)
	{
		DbManager db=new DbManager();
		return db.updb(sql);
	}
}
