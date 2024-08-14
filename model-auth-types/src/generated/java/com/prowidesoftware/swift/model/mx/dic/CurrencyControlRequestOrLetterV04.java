
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
 * The CurrencyControlRequestOrLetter message is sent by the reporting party (respectively the registration agent) to the registration agent (respectively the reporting party) to send a currency control related letter or to request for supporting documents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlRequestOrLetterV04", propOrder = {
    "grpHdr",
    "reqOrLttr",
    "splmtryData"
})
public class CurrencyControlRequestOrLetterV04 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader9 grpHdr;
    @XmlElement(name = "ReqOrLttr", required = true)
    protected List<SupportingDocumentRequestOrLetter4> reqOrLttr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader9 }
     *     
     */
    public CurrencyControlHeader9 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader9 }
     *     
     */
    public CurrencyControlRequestOrLetterV04 setGrpHdr(CurrencyControlHeader9 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the reqOrLttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqOrLttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqOrLttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocumentRequestOrLetter4 }
     * 
     * 
     */
    public List<SupportingDocumentRequestOrLetter4> getReqOrLttr() {
        if (reqOrLttr == null) {
            reqOrLttr = new ArrayList<SupportingDocumentRequestOrLetter4>();
        }
        return this.reqOrLttr;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the reqOrLttr list.
     * @see #getReqOrLttr()
     * 
     */
    public CurrencyControlRequestOrLetterV04 addReqOrLttr(SupportingDocumentRequestOrLetter4 reqOrLttr) {
        getReqOrLttr().add(reqOrLttr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CurrencyControlRequestOrLetterV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
