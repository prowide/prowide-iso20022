
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Customer renting a vehicle.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalCustomer2", propOrder = {
    "rntrNm",
    "corpNm",
    "corpIdr",
    "assgnr",
    "pmryDrvr",
    "addtlDrvr",
    "lltyPrgrmm"
})
public class VehicleRentalCustomer2 {

    @XmlElement(name = "RntrNm", required = true)
    protected String rntrNm;
    @XmlElement(name = "CorpNm")
    protected String corpNm;
    @XmlElement(name = "CorpIdr", required = true)
    protected String corpIdr;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected CustomerAssigner1Code assgnr;
    @XmlElement(name = "PmryDrvr")
    protected List<DriverInParty2> pmryDrvr;
    @XmlElement(name = "AddtlDrvr")
    protected List<DriverInParty2> addtlDrvr;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme2 lltyPrgrmm;

    /**
     * Gets the value of the rntrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntrNm() {
        return rntrNm;
    }

    /**
     * Sets the value of the rntrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalCustomer2 setRntrNm(String value) {
        this.rntrNm = value;
        return this;
    }

    /**
     * Gets the value of the corpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpNm() {
        return corpNm;
    }

    /**
     * Sets the value of the corpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalCustomer2 setCorpNm(String value) {
        this.corpNm = value;
        return this;
    }

    /**
     * Gets the value of the corpIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpIdr() {
        return corpIdr;
    }

    /**
     * Sets the value of the corpIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalCustomer2 setCorpIdr(String value) {
        this.corpIdr = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public CustomerAssigner1Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public VehicleRentalCustomer2 setAssgnr(CustomerAssigner1Code value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the pmryDrvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmryDrvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryDrvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverInParty2 }
     * 
     * 
     * @return
     *     The value of the pmryDrvr property.
     */
    public List<DriverInParty2> getPmryDrvr() {
        if (pmryDrvr == null) {
            pmryDrvr = new ArrayList<>();
        }
        return this.pmryDrvr;
    }

    /**
     * Gets the value of the addtlDrvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlDrvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlDrvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DriverInParty2 }
     * 
     * 
     * @return
     *     The value of the addtlDrvr property.
     */
    public List<DriverInParty2> getAddtlDrvr() {
        if (addtlDrvr == null) {
            addtlDrvr = new ArrayList<>();
        }
        return this.addtlDrvr;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public LoyaltyProgramme2 getLltyPrgrmm() {
        return lltyPrgrmm;
    }

    /**
     * Sets the value of the lltyPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramme2 }
     *     
     */
    public VehicleRentalCustomer2 setLltyPrgrmm(LoyaltyProgramme2 value) {
        this.lltyPrgrmm = value;
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
     * Adds a new item to the pmryDrvr list.
     * @see #getPmryDrvr()
     * 
     */
    public VehicleRentalCustomer2 addPmryDrvr(DriverInParty2 pmryDrvr) {
        getPmryDrvr().add(pmryDrvr);
        return this;
    }

    /**
     * Adds a new item to the addtlDrvr list.
     * @see #getAddtlDrvr()
     * 
     */
    public VehicleRentalCustomer2 addAddtlDrvr(DriverInParty2 addtlDrvr) {
        getAddtlDrvr().add(addtlDrvr);
        return this;
    }

}
