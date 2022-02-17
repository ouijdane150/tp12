package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.client;
import
org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ma.cigma.pfe.service.iclientservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@Controller
@RequestMapping("/client")
public class clientcontroller {
	@Autowired
	private iclientservice service;
	@GetMapping("/{id}")
	public client getOne(@PathVariable("id") long id){
	return service.getOne(id);
	}
	@GetMapping("/all")
	public List<client> getAll(){
	return service.getAll();
	}
	public client save(client clt) {
	return service.save(clt);
	}
	public client modify(client clt){
	return service.modify(clt);
	}
	@PostMapping("/create")
	public client save(@RequestBody client clt) {
	return service.save(clt);
	}
	@PutMapping("/update")
	public client modify(@RequestBody client clt){
	return service.modify(clt);
	}

	}

