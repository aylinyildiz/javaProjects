package homework3.business;

import homework3.core.logging.Logger;
import homework3.dataAccess.educator.EducatorDao;
import homework3.entities.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private Logger[] loggers;

	public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;
	}

	public void add(Educator educator) {
		for (Logger logger : loggers) {
			logger.log(educator.getName());
		}
	}

}
