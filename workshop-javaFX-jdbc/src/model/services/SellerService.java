package model.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public class SellerService {
	public List<Seller> findAll() {
		List<Seller> list = new ArrayList<>();
		
		Department dep = new Department(1, "Library");
		
		list.add(new Seller(1, "Books", "as", new Date(), 1.00, dep));
		list.add(new Seller(2, "Sheet", "as", new Date(), 1.00, dep));
		list.add(new Seller(3, "Historys", "as", new Date(), 1.00, dep));
		return list;
	}
}
