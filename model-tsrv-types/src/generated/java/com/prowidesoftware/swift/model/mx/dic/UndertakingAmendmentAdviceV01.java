
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The UndertakingAmendmentAdvice message is sent by an advising party to the beneficiary, either directly or via one or more other advising parties in the transaction chain, to advise the content of a proposed amendment to an undertaking. Information about the message may also be sent to other interested parties. The proposed undertaking amendment could be to a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). In addition to providing the terms of the proposed amendment and relevant details on proposed changes to the undertaking, the message may provide information from the sender such as confirmation details. It may also be used to advise the proposed termination or cancellation of the undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmendmentAdviceV01", propOrder = {
    "advsgPty",
    "scndAdvsgPty",
    "dtOfAdvc",
    "udrtkgAmdmntAdvcDtls",
    "bkToBkInf",
    "dgtlSgntr"
})
public class UndertakingAmendmentAdviceV01 {

    @XmlElement(name = "AdvsgPty", required = true)
    protected PartyIdentification43 advsgPty;
    @XmlElement(name = "ScndAdvsgPty")
    protected PartyIdentification43 scndAdvsgPty;
    @XmlElement(name = "DtOfAdvc", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dtOfAdvc;
    @XmlElement(name = "UdrtkgAmdmntAdvcDtls", required = true)
    protected Amendment2 udrtkgAmdmntAdvcDtls;
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
    public UndertakingAmendmentAdviceV01 setAdvsgPty(PartyIdentification43 value) {
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
    public UndertakingAmendmentAdviceV01 setScndAdvsgPty(PartyIdentification43 value) {
        this.scndAdvsgPty = value;
        return this;
    }

    /**
     * Gets the value of the dtOfAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDtOfAdvc() {
        return dtOfAdvc;
    }

    /**
     * Sets the value of the dtOfAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingAmendmentAdviceV01 setDtOfAdvc(Calendar value) {
        this.dtOfAdvc = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgAmdmntAdvcDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment2 }
     *     
     */
    public Amendment2 getUdrtkgAmdmntAdvcDtls() {
        return udrtkgAmdmntAdvcDtls;
    }

    /**
     * Sets the value of the udrtkgAmdmntAdvcDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment2 }
     *     
     */
    public UndertakingAmendmentAdviceV01 setUdrtkgAmdmntAdvcDtls(Amendment2 value) {
        this.udrtkgAmdmntAdvcDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkToBkInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkToBkInf property.
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
     * @return
     *     The value of the bkToBkInf property.
     */
    public List<String> getBkToBkInf() {
        if (bkToBkInf == null) {
            bkToBkInf = new ArrayList<>();
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
    public UndertakingAmendmentAdviceV01 setDgtlSgntr(PartyAndSignature2 value) {
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
    public UndertakingAmendmentAdviceV01 addBkToBkInf(String bkToBkInf) {
        getBkToBkInf().add(bkToBkInf);
        return this;
    }

}
