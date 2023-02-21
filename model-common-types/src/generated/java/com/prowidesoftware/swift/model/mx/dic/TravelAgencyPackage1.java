
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
@XmlType(name = "TravelAgencyPackage1", propOrder = {
    "rsvatnNb",
    "trvlPackgTp",
    "nbInPty",
    "cstmrRef",
    "dataSrc",
    "dlvryOrdrNb",
    "cdtCardSlipNb",
    "insrncInd",
    "insrncAmt",
    "fee"
})
public class TravelAgencyPackage1 {

    @XmlElement(name = "RsvatnNb")
    protected String rsvatnNb;
    @XmlElement(name = "TrvlPackgTp")
    protected String trvlPackgTp;
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
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
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
    public TravelAgencyPackage1 setRsvatnNb(String value) {
        this.rsvatnNb = value;
        return this;
    }

    /**
     * Gets the value of the trvlPackgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrvlPackgTp() {
        return trvlPackgTp;
    }

    /**
     * Sets the value of the trvlPackgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TravelAgencyPackage1 setTrvlPackgTp(String value) {
        this.trvlPackgTp = value;
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
    public TravelAgencyPackage1 setNbInPty(String value) {
        this.nbInPty = value;
        return this;
    }

    /**
     * Gets the value of the cstmrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cstmrRef property.
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
     */
    public List<CustomerReference1> getCstmrRef() {
        if (cstmrRef == null) {
            cstmrRef = new ArrayList<CustomerReference1>();
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
    public TravelAgencyPackage1 setDataSrc(String value) {
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
    public TravelAgencyPackage1 setDlvryOrdrNb(String value) {
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
    public TravelAgencyPackage1 setCdtCardSlipNb(String value) {
        this.cdtCardSlipNb = value;
        return this;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TravelAgencyPackage1 setInsrncInd(Boolean value) {
        this.insrncInd = value;
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
    public TravelAgencyPackage1 setInsrncAmt(BigDecimal value) {
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
    public TravelAgencyPackage1 setFee(BigDecimal value) {
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
    public TravelAgencyPackage1 addCstmrRef(CustomerReference1 cstmrRef) {
        getCstmrRef().add(cstmrRef);
        return this;
    }

}
