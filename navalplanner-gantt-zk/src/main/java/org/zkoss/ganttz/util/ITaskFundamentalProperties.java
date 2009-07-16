package org.zkoss.ganttz.util;

import java.util.Date;

/**
 * @author Óscar González Fernández <ogonzalez@igalia.com>
 */
public interface ITaskFundamentalProperties {

    public String getName();

    public void setName(String name);

    public void setBeginDate(Date beginDate);

    public Date getBeginDate();

    public void setLengthMilliseconds(long lengthMilliseconds);

    public long getLengthMilliseconds();

    public String getNotes();

    public void setNotes(String notes);

}