package com.bpr;

import com.bpr.entity.master.Agama;
import com.bpr.entity.master.Pendidikan;
import com.bpr.service.AgamaService;
import com.bpr.service.PendidikanService;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AplikasiBprApplicationTests extends TestCase{

    @Autowired
	private AgamaService agamaService;
    @Autowired
    private PendidikanService  pendidikanService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testSimpanAgama(){
		Agama islam = new Agama(null, "Islam", "Muslim",
				Timestamp.valueOf(LocalDateTime.now()),"admin");
		agamaService.save(islam);

		Agama kristen = new Agama(null, "Kristen", "Kristen Protestan",
				Timestamp.valueOf(LocalDateTime.now()),"admin");
		agamaService.save(kristen);

        List<Agama> daftarAgama = agamaService.findAll();
        assertEquals(daftarAgama.size(),2 );

        agamaService.delete(daftarAgama);
        daftarAgama = agamaService.findAll();
        assertEquals(daftarAgama.size(), 0);

    }
         @Test
    public void testPendidikan(){
        List<Pendidikan> daftarPendidikan = pendidikanService.findAll();
        assertEquals(daftarPendidikan.size(), 3);
}
}