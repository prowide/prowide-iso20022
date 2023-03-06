
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status of the transfer cancellation is rejected.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferCancellationRejectedStatus1", propOrder = {
    "rsn",
    "xtndedRsn",
    "dataSrcSchme"
})
public class TransferCancellationRejectedStatus1 {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected CancellationRejectedReason1Code rsn;
    @XmlElement(name = "XtndedRsn")
    protected String xtndedRsn;
    @XmlElement(name = "DataSrcSchme")
    protected List<GenericIdentification1> dataSrcSchme;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRejectedReason1Code }
     *     
     */
    public CancellationRejectedReason1Code getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRejectedReason1Code }
     *     
     */
    public TransferCancellationRejectedStatus1 setRsn(CancellationRejectedReason1Code value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedRsn() {
        return xtndedRsn;
    }

    /**
     * Sets the value of the xtndedRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferCancellationRejectedStatus1 setXtndedRsn(String value) {
        this.xtndedRsn = value;
        return this;
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
     * Adds a new item to the dataSrcSchme list.
     * @see #getDataSrcSchme()
     * 
     */
    public TransferCancellationRejectedStatus1 addDataSrcSchme(GenericIdentification1 dataSrcSchme) {
        getDataSrcSchme().add(dataSrcSchme);
        return this;
    }

}
