
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
 * Status is rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedStatus3", propOrder = {
    "rsn",
    "dataSrcSchme"
})
public class RejectedStatus3 {

    @XmlElement(name = "Rsn")
    protected List<RejectedStatusReason6> rsn;
    @XmlElement(name = "DataSrcSchme")
    protected List<GenericIdentification1> dataSrcSchme;

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectedStatusReason6 }
     * 
     * 
     */
    public List<RejectedStatusReason6> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<RejectedStatusReason6>();
        }
        return this.rsn;
    }

    /**
     * Gets the value of the dataSrcSchme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataSrcSchme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSrcSchme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification1 }
     * 
     * 
     */
    public List<GenericIdentification1> getDataSrcSchme() {
        if (dataSrcSchme == null) {
            dataSrcSchme = new ArrayList<GenericIdentification1>();
        }
        return this.dataSrcSchme;
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
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public RejectedStatus3 addRsn(RejectedStatusReason6 rsn) {
        getRsn().add(rsn);
        return this;
    }

    /**
     * Adds a new item to the dataSrcSchme list.
     * @see #getDataSrcSchme()
     * 
     */
    public RejectedStatus3 addDataSrcSchme(GenericIdentification1 dataSrcSchme) {
        getDataSrcSchme().add(dataSrcSchme);
        return this;
    }

}
