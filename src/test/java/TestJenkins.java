
import javax.xml.bind.JAXBException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import tn.jihed.bean.Client;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/test-ui.beans.xml" })
public class TestJenkins {


	private static final Logger log = LoggerFactory.getLogger(TestJenkins.class);
	@Test
	public void test()
	{
		Client client =new Client();
		
		
		client.setNom("mechergui");
		client.setPrenom("jihed");
		log.info(client.toString());
		Assert.isTrue(false);
		
	}
}