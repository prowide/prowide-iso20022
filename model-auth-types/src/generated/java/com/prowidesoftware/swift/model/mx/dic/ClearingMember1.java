
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
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
 * Legal counterpart to trades cleared through a central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingMember1", propOrder = {
    "id",
    "cdtQlty",
    "ultmtPrntId",
    "futrsComssnMrchntInd",
    "mmbshVldFr",
    "mmbshVldTo",
    "spnsrgClrMmbId",
    "clrAcctOwnr"
})
public class ClearingMember1 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification118Choice id;
    @XmlElement(name = "CdtQlty", required = true)
    @XmlSchemaType(name = "string")
    protected CreditQuality1Code cdtQlty;
    @XmlElement(name = "UltmtPrntId")
    protected PartyIdentification118Choice ultmtPrntId;
    @XmlElement(name = "FutrsComssnMrchntInd")
    protected boolean futrsComssnMrchntInd;
    @XmlElement(name = "MmbshVldFr", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mmbshVldFr;
    @XmlElement(name = "MmbshVldTo", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mmbshVldTo;
    @XmlElement(name = "SpnsrgClrMmbId")
    protected PartyIdentification118Choice spnsrgClrMmbId;
    @XmlElement(name = "ClrAcctOwnr", required = true)
    protected List<ClearingAccount1> clrAcctOwnr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public ClearingMember1 setId(PartyIdentification118Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the cdtQlty property.
     * 
     * @return
     *     possible object is
     *     {@link CreditQuality1Code }
     *     
     */
    public CreditQuality1Code getCdtQlty() {
        return cdtQlty;
    }

    /**
     * Sets the value of the cdtQlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditQuality1Code }
     *     
     */
    public ClearingMember1 setCdtQlty(CreditQuality1Code value) {
        this.cdtQlty = value;
        return this;
    }

    /**
     * Gets the value of the ultmtPrntId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getUltmtPrntId() {
        return ultmtPrntId;
    }

    /**
     * Sets the value of the ultmtPrntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public ClearingMember1 setUltmtPrntId(PartyIdentification118Choice value) {
        this.ultmtPrntId = value;
        return this;
    }

    /**
     * Gets the value of the futrsComssnMrchntInd property.
     * 
     */
    public boolean isFutrsComssnMrchntInd() {
        return futrsComssnMrchntInd;
    }

    /**
     * Sets the value of the futrsComssnMrchntInd property.
     * 
     */
    public ClearingMember1 setFutrsComssnMrchntInd(boolean value) {
        this.futrsComssnMrchntInd = value;
        return this;
    }

    /**
     * Gets the value of the mmbshVldFr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMmbshVldFr() {
        return mmbshVldFr;
    }

    /**
     * Sets the value of the mmbshVldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingMember1 setMmbshVldFr(LocalDate value) {
        this.mmbshVldFr = value;
        return this;
    }

    /**
     * Gets the value of the mmbshVldTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMmbshVldTo() {
        return mmbshVldTo;
    }

    /**
     * Sets the value of the mmbshVldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingMember1 setMmbshVldTo(LocalDate value) {
        this.mmbshVldTo = value;
        return this;
    }

    /**
     * Gets the value of the spnsrgClrMmbId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public PartyIdentification118Choice getSpnsrgClrMmbId() {
        return spnsrgClrMmbId;
    }

    /**
     * Sets the value of the spnsrgClrMmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification118Choice }
     *     
     */
    public ClearingMember1 setSpnsrgClrMmbId(PartyIdentification118Choice value) {
        this.spnsrgClrMmbId = value;
        return this;
    }

    /**
     * Gets the value of the clrAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clrAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingAccount1 }
     * 
     * 
     * @return
     *     The value of the clrAcctOwnr property.
     */
    public List<ClearingAccount1> getClrAcctOwnr() {
        if (clrAcctOwnr == null) {
            clrAcctOwnr = new ArrayList<>();
        }
        return this.clrAcctOwnr;
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
     * Adds a new item to the clrAcctOwnr list.
     * @see #getClrAcctOwnr()
     * 
     */
    public ClearingMember1 addClrAcctOwnr(ClearingAccount1 clrAcctOwnr) {
        getClrAcctOwnr().add(clrAcctOwnr);
        return this;
    }

}
