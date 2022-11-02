package kodlama.io.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

//repository: veritabanı işlemleri
public interface BrandRepository extends JpaRepository<Brand,Integer> {
	

}
