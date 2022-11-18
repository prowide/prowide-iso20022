
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
 * Funds related service such as a payment or a transfer related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingService2", propOrder = {
    "fndgSvc",
    "fndgSrc",
    "clmInf"
})
public class FundingService2 {

    @XmlElement(name = "FndgSvc")
    protected TransferService2 fndgSvc;
    @XmlElement(name = "FndgSrc")
    protected List<FundingSource2> fndgSrc;
    @XmlElement(name = "ClmInf")
    protected ClaimInformation1 clmInf;

    /**
     * Gets the value of the fndgSvc property.
     * 
     * @return
     *     possible object is
     *     {@link TransferService2 }
     *     
     */
    public TransferService2 getFndgSvc() {
        return fndgSvc;
    }

    /**
     * Sets the value of the fndgSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferService2 }
     *     
     */
    public FundingService2 setFndgSvc(TransferService2 value) {
        this.fndgSvc = value;
        return this;
    }

    /**
     * Gets the value of the fndgSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndgSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndgSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingSource2 }
     * 
     * 
     */
    public List<FundingSource2> getFndgSrc() {
        if (fndgSrc == null) {
            fndgSrc = new ArrayList<FundingSource2>();
        }
        return this.fndgSrc;
    }

    /**
     * Gets the value of the clmInf property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInformation1 }
     *     
     */
    public ClaimInformation1 getClmInf() {
        return clmInf;
    }

    /**
     * Sets the value of the clmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInformation1 }
     *     
     */
    public FundingService2 setClmInf(ClaimInformation1 value) {
        this.clmInf = value;
        return this;
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
     * Adds a new item to the fndgSrc list.
     * @see #getFndgSrc()
     * 
     */
    public FundingService2 addFndgSrc(FundingSource2 fndgSrc) {
        getFndgSrc().add(fndgSrc);
        return this;
    }

}
