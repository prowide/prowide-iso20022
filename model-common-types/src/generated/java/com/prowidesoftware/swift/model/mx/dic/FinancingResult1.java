
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The final result of a single invoice financing request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingResult1", propOrder = {
    "fincgReqSts",
    "stsRsn",
    "addtlStsRsnInf",
    "fincdAmt"
})
public class FinancingResult1 {

    @XmlElement(name = "FincgReqSts", required = true)
    @XmlSchemaType(name = "string")
    protected RequestStatus1Code fincgReqSts;
    @XmlElement(name = "StsRsn")
    protected StatusReason4Choice stsRsn;
    @XmlElement(name = "AddtlStsRsnInf")
    protected List<String> addtlStsRsnInf;
    @XmlElement(name = "FincdAmt")
    protected FinancingRateOrAmountChoice fincdAmt;

    /**
     * Gets the value of the fincgReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus1Code }
     *     
     */
    public RequestStatus1Code getFincgReqSts() {
        return fincgReqSts;
    }

    /**
     * Sets the value of the fincgReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus1Code }
     *     
     */
    public FinancingResult1 setFincgReqSts(RequestStatus1Code value) {
        this.fincgReqSts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason4Choice }
     *     
     */
    public StatusReason4Choice getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason4Choice }
     *     
     */
    public FinancingResult1 setStsRsn(StatusReason4Choice value) {
        this.stsRsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlStsRsnInf() {
        if (addtlStsRsnInf == null) {
            addtlStsRsnInf = new ArrayList<String>();
        }
        return this.addtlStsRsnInf;
    }

    /**
     * Gets the value of the fincdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingRateOrAmountChoice getFincdAmt() {
        return fincdAmt;
    }

    /**
     * Sets the value of the fincdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingResult1 setFincdAmt(FinancingRateOrAmountChoice value) {
        this.fincdAmt = value;
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
     * Adds a new item to the addtlStsRsnInf list.
     * @see #getAddtlStsRsnInf()
     * 
     */
    public FinancingResult1 addAddtlStsRsnInf(String addtlStsRsnInf) {
        getAddtlStsRsnInf().add(addtlStsRsnInf);
        return this;
    }

}
