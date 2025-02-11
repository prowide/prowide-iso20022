
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
 * The UndertakingAmendment message is sent (and is thus issued) by the party that issued the undertaking. The message may be sent either directly to the beneficiary or via an advising party. The proposed undertaking amendment could be to a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). The message provides details on proposed changes to the undertaking, for example, to the expiry date, the amount, and terms and conditions of the undertaking. It may also be used to propose the termination or cancellation of the undertaking. Under practice and law, this communication binds the party issuing it. The message constitutes an operative financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmendmentV01", propOrder = {
    "udrtkgAmdmntDtls",
    "bkToBkInf",
    "dgtlSgntr"
})
public class UndertakingAmendmentV01 {

    @XmlElement(name = "UdrtkgAmdmntDtls", required = true)
    protected Amendment1 udrtkgAmdmntDtls;
    @XmlElement(name = "BkToBkInf")
    protected List<String> bkToBkInf;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature2> dgtlSgntr;

    /**
     * Gets the value of the udrtkgAmdmntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment1 }
     *     
     */
    public Amendment1 getUdrtkgAmdmntDtls() {
        return udrtkgAmdmntDtls;
    }

    /**
     * Sets the value of the udrtkgAmdmntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment1 }
     *     
     */
    public UndertakingAmendmentV01 setUdrtkgAmdmntDtls(Amendment1 value) {
        this.udrtkgAmdmntDtls = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature2 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature2> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
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
    public UndertakingAmendmentV01 addBkToBkInf(String bkToBkInf) {
        getBkToBkInf().add(bkToBkInf);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public UndertakingAmendmentV01 addDgtlSgntr(PartyAndSignature2 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
