
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Provides detailed information about the travel package, excluding specific itinerary data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelAgencyPackage2", propOrder = {
    "rsvatnNb",
    "tp",
    "nbInPty",
    "cstmrRef",
    "dataSrc",
    "dlvryOrdrNb",
    "cdtCardSlipNb",
    "insrnc",
    "insrncAmt",
    "fee"
})
public class TravelAgencyPackage2 {

    @XmlElement(name = "RsvatnNb")
    protected String rsvatnNb;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "NbInPty")
    protected String nbInPty;
    @XmlElement(name = "CstmrRef")
    protected List<CustomerReference1> cstmrRef;
    @XmlElement(name = "DataSrc")
    protected String dataSrc;
    @XmlElement(name = "DlvryOrdrNb")
    protected String dlvryOrdrNb;
    @XmlElement(name = "CdtCardSlipNb")
    protected String cdtCardSlipNb;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "Fee")
    protected BigDecimal fee;

    /**
     * Gets the value of the rsvatnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsvatnNb() {
        return rsvatnNb;
    }

    /**
     * Sets the value of the rsvatnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgencyPackage2 setRsvatnNb(String value) {
        this.rsvatnNb = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgencyPackage2 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the nbInPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbInPty() {
        return nbInPty;
    }

    /**
     * Sets the value of the nbInPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgencyPackage2 setNbInPty(String value) {
        this.nbInPty = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReference1 }
     * 
     * 
     * @return
     *     The value of the cstmrRef property.
     */
    public List<CustomerReference1> getCstmrRef() {
        if (cstmrRef == null) {
            cstmrRef = new ArrayList<>();
        }
        return this.cstmrRef;
    }

    /**
     * Gets the value of the dataSrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSrc() {
        return dataSrc;
    }

    /**
     * Sets the value of the dataSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgencyPackage2 setDataSrc(String value) {
        this.dataSrc = value;
        return this;
    }

    /**
     * Gets the value of the dlvryOrdrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryOrdrNb() {
        return dlvryOrdrNb;
    }

    /**
     * Sets the value of the dlvryOrdrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgencyPackage2 setDlvryOrdrNb(String value) {
        this.dlvryOrdrNb = value;
        return this;
    }

    /**
     * Gets the value of the cdtCardSlipNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtCardSlipNb() {
        return cdtCardSlipNb;
    }

    /**
     * Sets the value of the cdtCardSlipNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgencyPackage2 setCdtCardSlipNb(String value) {
        this.cdtCardSlipNb = value;
        return this;
    }

    /**
     * Gets the value of the insrnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrnc() {
        return insrnc;
    }

    /**
     * Sets the value of the insrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TravelAgencyPackage2 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TravelAgencyPackage2 setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
        return this;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TravelAgencyPackage2 setFee(BigDecimal value) {
        this.fee = value;
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
     * Adds a new item to the cstmrRef list.
     * @see #getCstmrRef()
     * 
     */
    public TravelAgencyPackage2 addCstmrRef(CustomerReference1 cstmrRef) {
        getCstmrRef().add(cstmrRef);
        return this;
    }

}
