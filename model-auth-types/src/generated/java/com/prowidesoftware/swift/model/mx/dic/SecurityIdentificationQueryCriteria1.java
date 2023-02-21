
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Query based on ISIN or an alternative format for the identification of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentificationQueryCriteria1", propOrder = {
    "isin",
    "altrntvInstrmId"
})
public class SecurityIdentificationQueryCriteria1 {

    @XmlElement(name = "ISIN")
    protected List<String> isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected List<String> altrntvInstrmId;

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<String>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altrntvInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrntvInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAltrntvInstrmId() {
        if (altrntvInstrmId == null) {
            altrntvInstrmId = new ArrayList<String>();
        }
        return this.altrntvInstrmId;
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
     * Adds a new item to the iSIN list.
     * @see #getISIN()
     * 
     */
    public SecurityIdentificationQueryCriteria1 addISIN(String iSIN) {
        getISIN().add(iSIN);
        return this;
    }

    /**
     * Adds a new item to the altrntvInstrmId list.
     * @see #getAltrntvInstrmId()
     * 
     */
    public SecurityIdentificationQueryCriteria1 addAltrntvInstrmId(String altrntvInstrmId) {
        getAltrntvInstrmId().add(altrntvInstrmId);
        return this;
    }

}
