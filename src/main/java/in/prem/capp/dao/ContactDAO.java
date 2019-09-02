package in.prem.capp.dao;

import in.prem.capp.domain.Contact;
import java.util.List;

public interface ContactDAO {

    public void save(Contact c);
    public void update(Contact c);
    public void delete(Contact c);
    public void delete(Integer contactId);  //Primary Key
    public Contact findById(Integer contactId);
    public List<Contact> findAll();
    public List<Contact> findByProperty(String propName, Object propValue);
}
