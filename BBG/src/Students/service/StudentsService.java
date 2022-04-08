package Students.service;

import Students.Exception.KoreanOnlyException;

public interface StudentsService {

    public void add();

    public void list();

    public void modify() throws KoreanOnlyException;

    public void delete();
}
