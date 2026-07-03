
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports on limits.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Limits5", propOrder = {
    "curLmt",
    "dfltLmt"
})
public class Limits5 {

    @XmlElement(name = "CurLmt")
    protected List<LimitReport5> curLmt;
    @XmlElement(name = "DfltLmt")
    protected List<LimitReport5> dfltLmt;

    /**
     * Gets the value of the curLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitReport5 }
     * 
     * 
     */
    public List<LimitReport5> getCurLmt() {
        if (curLmt == null) {
            curLmt = new ArrayList<LimitReport5>();
        }
        return this.curLmt;
    }

    /**
     * Gets the value of the dfltLmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dfltLmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltLmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitReport5 }
     * 
     * 
     */
    public List<LimitReport5> getDfltLmt() {
        if (dfltLmt == null) {
            dfltLmt = new ArrayList<LimitReport5>();
        }
        return this.dfltLmt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the curLmt list.
     * @see #getCurLmt()
     * 
     */
    public Limits5 addCurLmt(LimitReport5 curLmt) {
        getCurLmt().add(curLmt);
        return this;
    }

    /**
     * Adds a new item to the dfltLmt list.
     * @see #getDfltLmt()
     * 
     */
    public Limits5 addDfltLmt(LimitReport5 dfltLmt) {
        getDfltLmt().add(dfltLmt);
        return this;
    }

}
