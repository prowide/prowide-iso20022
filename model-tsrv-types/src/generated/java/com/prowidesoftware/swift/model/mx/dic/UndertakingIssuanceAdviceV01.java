
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
 * The UndertakingIssuanceAdvice message is sent by an advising party to the beneficiary, either directly or via one or more other advising parties in the transaction chain, to advise the issuance of an undertaking. Other interested parties may also be informed of the advice. The undertaking advised could be a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). In addition to providing details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking, the advice may provide information from the sender such as confirmation details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingIssuanceAdviceV01", propOrder = {
    "advsgPty",
    "scndAdvsgPty",
    "dtOfAdvc",
    "udrtkgIssncAdvcDtls",
    "bkToBkInf",
    "dgtlSgntr"
})
public class UndertakingIssuanceAdviceV01 {

    @XmlElement(name = "AdvsgPty", required = true)
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "DtOfAdvc", required = true)
    protected DateAndDateTimeChoice dtOfAdvc;
    @XmlElement(name = "UdrtkgIssncAdvcDtls", required = true)
    protected UndertakingAdvice1 udrtkgIssncAdvcDtls;
    @XmlElement(name = "BkToBkInf")
    protected List<String> bkToBkInf;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the advsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getAdvsgPty() {
        return advsgPty;
    }

    /**
     * Sets the value of the advsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public UndertakingIssuanceAdviceV01 setAdvsgPty(PartyIdentification43 value) {
        this.advsgPty = value;
        return this;
    }

    /**
     * Gets the value of the scndAdvsgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getScndAdvsgPty() {
        return scndAdvsgPty;
    }

    /**
     * Sets the value of the scndAdvsgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public UndertakingIssuanceAdviceV01 setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
        return this;
    }

    /**
     * Gets the value of the dtOfAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDtOfAdvc() {
        return dtOfAdvc;
    }

    /**
     * Sets the value of the dtOfAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public UndertakingIssuanceAdviceV01 setDtOfAdvc(DateAndDateTimeChoice value) {
        this.dtOfAdvc = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgIssncAdvcDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAdvice1 }
     *     
     */
    public UndertakingAdvice1 getUdrtkgIssncAdvcDtls() {
        return udrtkgIssncAdvcDtls;
    }

    /**
     * Sets the value of the udrtkgIssncAdvcDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAdvice1 }
     *     
     */
    public UndertakingIssuanceAdviceV01 setUdrtkgIssncAdvcDtls(UndertakingAdvice1 value) {
        this.udrtkgIssncAdvcDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkToBkInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bkToBkInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkToBkInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBkToBkInf() {
        if (bkToBkInf == null) {
            bkToBkInf = new ArrayList<String>();
        }
        return this.bkToBkInf;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public UndertakingIssuanceAdviceV01 setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
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
     * Adds a new item to the bkToBkInf list.
     * @see #getBkToBkInf()
     * 
     */
    public UndertakingIssuanceAdviceV01 addBkToBkInf(String bkToBkInf) {
        getBkToBkInf().add(bkToBkInf);
        return this;
    }

}
