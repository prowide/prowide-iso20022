
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
 * The CurrencyControlRequestOrLetter message is sent by the reporting party (respectively the registration agent) to the registration agent (respectively the reporting party) to send a currency control related letter or to request for supporting documents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlRequestOrLetterV01", propOrder = {
    "grpHdr",
    "reqOrLttr",
    "splmtryData"
})
public class CurrencyControlRequestOrLetterV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader3 grpHdr;
    @XmlElement(name = "ReqOrLttr", required = true)
    protected List<SupportingDocumentRequestOrLetter1> reqOrLttr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader3 }
     *     
     */
    public CurrencyControlHeader3 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader3 }
     *     
     */
    public CurrencyControlRequestOrLetterV01 setGrpHdr(CurrencyControlHeader3 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the reqOrLttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqOrLttr property.
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
     * {@link SupportingDocumentRequestOrLetter1 }
     * 
     * 
     * @return
     *     The value of the reqOrLttr property.
     */
    public List<SupportingDocumentRequestOrLetter1> getReqOrLttr() {
        if (reqOrLttr == null) {
            reqOrLttr = new ArrayList<>();
        }
        return this.reqOrLttr;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public CurrencyControlRequestOrLetterV01 addReqOrLttr(SupportingDocumentRequestOrLetter1 reqOrLttr) {
        getReqOrLttr().add(reqOrLttr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CurrencyControlRequestOrLetterV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
