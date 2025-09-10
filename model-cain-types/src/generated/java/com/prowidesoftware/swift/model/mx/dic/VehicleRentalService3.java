
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
 * Vehicle rental service provides detailed vehicle rental information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalService3", propOrder = {
    "cpnyNm",
    "cpnyId",
    "cpnyAdr",
    "cpnyCtct",
    "cpnyTp",
    "cpnyOthrTp",
    "rntrNm",
    "rntrCorpNm",
    "rntrCorpIdr",
    "rntrCorpIdrAssgnr",
    "pmryDrvr",
    "addtlDrvr",
    "lltyPrgrmm",
    "summryCmmdtyId",
    "rntlAgrmt",
    "rntlInvc",
    "addtlData"
})
public class VehicleRentalService3 {

    @XmlElement(name = "CpnyNm")
    protected String cpnyNm;
    @XmlElement(name = "CpnyId")
    protected PartyIdentification285 cpnyId;
    @XmlElement(name = "CpnyAdr")
    protected Address2 cpnyAdr;
    @XmlElement(name = "CpnyCtct")
    protected ContactBusiness1 cpnyCtct;
    @XmlElement(name = "CpnyTp")
    @XmlSchemaType(name = "string")
    protected CarRentalActivity1Code cpnyTp;
    @XmlElement(name = "CpnyOthrTp")
    protected String cpnyOthrTp;
    @XmlElement(name = "RntrNm", required = true)
    protected String rntrNm;
    @XmlElement(name = "RntrCorpNm")
    protected String rntrCorpNm;
    @XmlElement(name = "RntrCorpIdr", required = true)
    protected String rntrCorpIdr;
    @XmlElement(name = "RntrCorpIdrAssgnr")
    @XmlSchemaType(name = "string")
    protected CustomerAssigner1Code rntrCorpIdrAssgnr;
    @XmlElement(name = "PmryDrvr")
    protected DriverInParty3 pmryDrvr;
    @XmlElement(name = "AddtlDrvr")
    protected List<DriverInParty3> addtlDrvr;
    @XmlElement(name = "LltyPrgrmm")
    protected LoyaltyProgramme4 lltyPrgrmm;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "RntlAgrmt")
    protected VehicleRentalAgreement3 rntlAgrmt;
    @XmlElement(name = "RntlInvc")
    protected VehicleRentalInvoice3 rntlInvc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the cpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyNm() {
        return cpnyNm;
    }

    /**
     * Sets the value of the cpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService3 setCpnyNm(String value) {
        this.cpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the cpnyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification285 }
     *     
     */
    public PartyIdentification285 getCpnyId() {
        return cpnyId;
    }

    /**
     * Sets the value of the cpnyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification285 }
     *     
     */
    public VehicleRentalService3 setCpnyId(PartyIdentification285 value) {
        this.cpnyId = value;
        return this;
    }

    /**
     * Gets the value of the cpnyAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getCpnyAdr() {
        return cpnyAdr;
    }

    /**
     * Sets the value of the cpnyAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public VehicleRentalService3 setCpnyAdr(Address2 value) {
        this.cpnyAdr = value;
        return this;
    }

    /**
     * Gets the value of the cpnyCtct property.
     * 
     * @return
     *     possible object is
     *     {@link ContactBusiness1 }
     *     
     */
    public ContactBusiness1 getCpnyCtct() {
        return cpnyCtct;
    }

    /**
     * Sets the value of the cpnyCtct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactBusiness1 }
     *     
     */
    public VehicleRentalService3 setCpnyCtct(ContactBusiness1 value) {
        this.cpnyCtct = value;
        return this;
    }

    /**
     * Gets the value of the cpnyTp property.
     * 
     * @return
     *     possible object is
     *     {@link CarRentalActivity1Code }
     *     
     */
    public CarRentalActivity1Code getCpnyTp() {
        return cpnyTp;
    }

    /**
     * Sets the value of the cpnyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarRentalActivity1Code }
     *     
     */
    public VehicleRentalService3 setCpnyTp(CarRentalActivity1Code value) {
        this.cpnyTp = value;
        return this;
    }

    /**
     * Gets the value of the cpnyOthrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyOthrTp() {
        return cpnyOthrTp;
    }

    /**
     * Sets the value of the cpnyOthrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService3 setCpnyOthrTp(String value) {
        this.cpnyOthrTp = value;
        return this;
    }

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
    public VehicleRentalService3 setRntrNm(String value) {
        this.rntrNm = value;
        return this;
    }

    /**
     * Gets the value of the rntrCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntrCorpNm() {
        return rntrCorpNm;
    }

    /**
     * Sets the value of the rntrCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService3 setRntrCorpNm(String value) {
        this.rntrCorpNm = value;
        return this;
    }

    /**
     * Gets the value of the rntrCorpIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRntrCorpIdr() {
        return rntrCorpIdr;
    }

    /**
     * Sets the value of the rntrCorpIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService3 setRntrCorpIdr(String value) {
        this.rntrCorpIdr = value;
        return this;
    }

    /**
     * Gets the value of the rntrCorpIdrAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public CustomerAssigner1Code getRntrCorpIdrAssgnr() {
        return rntrCorpIdrAssgnr;
    }

    /**
     * Sets the value of the rntrCorpIdrAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAssigner1Code }
     *     
     */
    public VehicleRentalService3 setRntrCorpIdrAssgnr(CustomerAssigner1Code value) {
        this.rntrCorpIdrAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the pmryDrvr property.
     * 
     * @return
     *     possible object is
     *     {@link DriverInParty3 }
     *     
     */
    public DriverInParty3 getPmryDrvr() {
        return pmryDrvr;
    }

    /**
     * Sets the value of the pmryDrvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverInParty3 }
     *     
     */
    public VehicleRentalService3 setPmryDrvr(DriverInParty3 value) {
        this.pmryDrvr = value;
        return this;
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
     * {@link DriverInParty3 }
     * 
     * 
     * @return
     *     The value of the addtlDrvr property.
     */
    public List<DriverInParty3> getAddtlDrvr() {
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
     *     {@link LoyaltyProgramme4 }
     *     
     */
    public LoyaltyProgramme4 getLltyPrgrmm() {
        return lltyPrgrmm;
    }

    /**
     * Sets the value of the lltyPrgrmm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramme4 }
     *     
     */
    public VehicleRentalService3 setLltyPrgrmm(LoyaltyProgramme4 value) {
        this.lltyPrgrmm = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalService3 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the rntlAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalAgreement3 }
     *     
     */
    public VehicleRentalAgreement3 getRntlAgrmt() {
        return rntlAgrmt;
    }

    /**
     * Sets the value of the rntlAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalAgreement3 }
     *     
     */
    public VehicleRentalService3 setRntlAgrmt(VehicleRentalAgreement3 value) {
        this.rntlAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the rntlInvc property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalInvoice3 }
     *     
     */
    public VehicleRentalInvoice3 getRntlInvc() {
        return rntlInvc;
    }

    /**
     * Sets the value of the rntlInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalInvoice3 }
     *     
     */
    public VehicleRentalService3 setRntlInvc(VehicleRentalInvoice3 value) {
        this.rntlInvc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
     * Adds a new item to the addtlDrvr list.
     * @see #getAddtlDrvr()
     * 
     */
    public VehicleRentalService3 addAddtlDrvr(DriverInParty3 addtlDrvr) {
        getAddtlDrvr().add(addtlDrvr);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public VehicleRentalService3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
