
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Agreement (contract) related to a vehicle rental service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalAgreement3", propOrder = {
    "nb",
    "adjstd",
    "rntlLctn",
    "pckpLctn",
    "chckOutDt",
    "chckOutTm",
    "rtrLctn",
    "chckInDt",
    "chckInTm",
    "drtn",
    "clss",
    "make",
    "mdl",
    "regnNb",
    "trvlDstnc",
    "rntlRate",
    "rntlDtls",
    "insrnc",
    "addtlAmt",
    "estmtdTax",
    "dscntPrgrmm",
    "lltyPrgrmm"
})
public class VehicleRentalAgreement3 {

    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "Adjstd")
    protected Boolean adjstd;
    @XmlElement(name = "RntlLctn")
    protected Address2 rntlLctn;
    @XmlElement(name = "PckpLctn")
    protected List<Address2> pckpLctn;
    @XmlElement(name = "ChckOutDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate chckOutDt;
    @XmlElement(name = "ChckOutTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime chckOutTm;
    @XmlElement(name = "RtrLctn")
    protected Address2 rtrLctn;
    @XmlElement(name = "ChckInDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate chckInDt;
    @XmlElement(name = "ChckInTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime chckInTm;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "Clss")
    protected String clss;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "RegnNb")
    protected String regnNb;
    @XmlElement(name = "TrvlDstnc")
    protected Distance1 trvlDstnc;
    @XmlElement(name = "RntlRate")
    protected List<RentalRate2> rntlRate;
    @XmlElement(name = "RntlDtls")
    protected RentalDetails3 rntlDtls;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "AddtlAmt")
    protected List<Amount21> addtlAmt;
    @XmlElement(name = "EstmtdTax")
    protected List<Tax41> estmtdTax;
    @XmlElement(name = "DscntPrgrmm")
    protected List<Discount3> dscntPrgrmm;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme5> lltyPrgrmm;

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setNb(String value) {
        this.nb = value;
        return this;
    }

    /**
     * Gets the value of the adjstd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjstd() {
        return adjstd;
    }

    /**
     * Sets the value of the adjstd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalAgreement3 setAdjstd(Boolean value) {
        this.adjstd = value;
        return this;
    }

    /**
     * Gets the value of the rntlLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getRntlLctn() {
        return rntlLctn;
    }

    /**
     * Sets the value of the rntlLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public VehicleRentalAgreement3 setRntlLctn(Address2 value) {
        this.rntlLctn = value;
        return this;
    }

    /**
     * Gets the value of the pckpLctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pckpLctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPckpLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address2 }
     * 
     * 
     * @return
     *     The value of the pckpLctn property.
     */
    public List<Address2> getPckpLctn() {
        if (pckpLctn == null) {
            pckpLctn = new ArrayList<>();
        }
        return this.pckpLctn;
    }

    /**
     * Gets the value of the chckOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getChckOutDt() {
        return chckOutDt;
    }

    /**
     * Sets the value of the chckOutDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setChckOutDt(LocalDate value) {
        this.chckOutDt = value;
        return this;
    }

    /**
     * Gets the value of the chckOutTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getChckOutTm() {
        return chckOutTm;
    }

    /**
     * Sets the value of the chckOutTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setChckOutTm(OffsetTime value) {
        this.chckOutTm = value;
        return this;
    }

    /**
     * Gets the value of the rtrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getRtrLctn() {
        return rtrLctn;
    }

    /**
     * Sets the value of the rtrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public VehicleRentalAgreement3 setRtrLctn(Address2 value) {
        this.rtrLctn = value;
        return this;
    }

    /**
     * Gets the value of the chckInDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getChckInDt() {
        return chckInDt;
    }

    /**
     * Sets the value of the chckInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setChckInDt(LocalDate value) {
        this.chckInDt = value;
        return this;
    }

    /**
     * Gets the value of the chckInTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getChckInTm() {
        return chckInTm;
    }

    /**
     * Sets the value of the chckInTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setChckInTm(OffsetTime value) {
        this.chckInTm = value;
        return this;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setDrtn(String value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the clss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClss() {
        return clss;
    }

    /**
     * Sets the value of the clss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setClss(String value) {
        this.clss = value;
        return this;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setMake(String value) {
        this.make = value;
        return this;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setMdl(String value) {
        this.mdl = value;
        return this;
    }

    /**
     * Gets the value of the regnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnNb() {
        return regnNb;
    }

    /**
     * Sets the value of the regnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement3 setRegnNb(String value) {
        this.regnNb = value;
        return this;
    }

    /**
     * Gets the value of the trvlDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link Distance1 }
     *     
     */
    public Distance1 getTrvlDstnc() {
        return trvlDstnc;
    }

    /**
     * Sets the value of the trvlDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance1 }
     *     
     */
    public VehicleRentalAgreement3 setTrvlDstnc(Distance1 value) {
        this.trvlDstnc = value;
        return this;
    }

    /**
     * Gets the value of the rntlRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rntlRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRntlRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentalRate2 }
     * 
     * 
     * @return
     *     The value of the rntlRate property.
     */
    public List<RentalRate2> getRntlRate() {
        if (rntlRate == null) {
            rntlRate = new ArrayList<>();
        }
        return this.rntlRate;
    }

    /**
     * Gets the value of the rntlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RentalDetails3 }
     *     
     */
    public RentalDetails3 getRntlDtls() {
        return rntlDtls;
    }

    /**
     * Sets the value of the rntlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalDetails3 }
     *     
     */
    public VehicleRentalAgreement3 setRntlDtls(RentalDetails3 value) {
        this.rntlDtls = value;
        return this;
    }

    /**
     * Gets the value of the insrnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrnc() {
        return insrnc;
    }

    /**
     * Sets the value of the insrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalAgreement3 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount21 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<Amount21> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the estmtdTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estmtdTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax41 }
     * 
     * 
     * @return
     *     The value of the estmtdTax property.
     */
    public List<Tax41> getEstmtdTax() {
        if (estmtdTax == null) {
            estmtdTax = new ArrayList<>();
        }
        return this.estmtdTax;
    }

    /**
     * Gets the value of the dscntPrgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dscntPrgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDscntPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Discount3 }
     * 
     * 
     * @return
     *     The value of the dscntPrgrmm property.
     */
    public List<Discount3> getDscntPrgrmm() {
        if (dscntPrgrmm == null) {
            dscntPrgrmm = new ArrayList<>();
        }
        return this.dscntPrgrmm;
    }

    /**
     * Gets the value of the lltyPrgrmm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyPrgrmm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyPrgrmm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramme5 }
     * 
     * 
     * @return
     *     The value of the lltyPrgrmm property.
     */
    public List<LoyaltyProgramme5> getLltyPrgrmm() {
        if (lltyPrgrmm == null) {
            lltyPrgrmm = new ArrayList<>();
        }
        return this.lltyPrgrmm;
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
     * Adds a new item to the pckpLctn list.
     * @see #getPckpLctn()
     * 
     */
    public VehicleRentalAgreement3 addPckpLctn(Address2 pckpLctn) {
        getPckpLctn().add(pckpLctn);
        return this;
    }

    /**
     * Adds a new item to the rntlRate list.
     * @see #getRntlRate()
     * 
     */
    public VehicleRentalAgreement3 addRntlRate(RentalRate2 rntlRate) {
        getRntlRate().add(rntlRate);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public VehicleRentalAgreement3 addAddtlAmt(Amount21 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the estmtdTax list.
     * @see #getEstmtdTax()
     * 
     */
    public VehicleRentalAgreement3 addEstmtdTax(Tax41 estmtdTax) {
        getEstmtdTax().add(estmtdTax);
        return this;
    }

    /**
     * Adds a new item to the dscntPrgrmm list.
     * @see #getDscntPrgrmm()
     * 
     */
    public VehicleRentalAgreement3 addDscntPrgrmm(Discount3 dscntPrgrmm) {
        getDscntPrgrmm().add(dscntPrgrmm);
        return this;
    }

    /**
     * Adds a new item to the lltyPrgrmm list.
     * @see #getLltyPrgrmm()
     * 
     */
    public VehicleRentalAgreement3 addLltyPrgrmm(LoyaltyProgramme5 lltyPrgrmm) {
        getLltyPrgrmm().add(lltyPrgrmm);
        return this;
    }

}
