
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
@XmlType(name = "VehicleRentalAgreement1", propOrder = {
    "agrmtNb",
    "adjstdInd",
    "rntlLctn",
    "pckpLctn",
    "chckOutDt",
    "chckOutTm",
    "rtrLctn",
    "chckInDt",
    "chckInTm",
    "drtn",
    "vhclClssDtls",
    "trvlDstnc",
    "rntlRate",
    "rntlDtls",
    "vhclRegnNb",
    "insrncInd",
    "addtlAmt",
    "estmtdTax",
    "dscntPrgrmm",
    "lltyPrgrmm"
})
public class VehicleRentalAgreement1 {

    @XmlElement(name = "AgrmtNb")
    protected String agrmtNb;
    @XmlElement(name = "AdjstdInd")
    protected Boolean adjstdInd;
    @XmlElement(name = "RntlLctn")
    protected Address1 rntlLctn;
    @XmlElement(name = "PckpLctn")
    protected List<Address1> pckpLctn;
    @XmlElement(name = "ChckOutDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate chckOutDt;
    @XmlElement(name = "ChckOutTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime chckOutTm;
    @XmlElement(name = "RtrLctn")
    protected Address1 rtrLctn;
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
    @XmlElement(name = "VhclClssDtls")
    protected Vehicle4 vhclClssDtls;
    @XmlElement(name = "TrvlDstnc")
    protected Distance1 trvlDstnc;
    @XmlElement(name = "RntlRate")
    protected List<RentalRate1> rntlRate;
    @XmlElement(name = "RntlDtls")
    protected RentalDetails1 rntlDtls;
    @XmlElement(name = "VhclRegnNb")
    protected String vhclRegnNb;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "AddtlAmt")
    protected List<Amount9> addtlAmt;
    @XmlElement(name = "EstmtdTax")
    protected List<Tax33> estmtdTax;
    @XmlElement(name = "DscntPrgrmm")
    protected List<Discount3> dscntPrgrmm;
    @XmlElement(name = "LltyPrgrmm")
    protected List<LoyaltyProgramme1> lltyPrgrmm;

    /**
     * Gets the value of the agrmtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgrmtNb() {
        return agrmtNb;
    }

    /**
     * Sets the value of the agrmtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement1 setAgrmtNb(String value) {
        this.agrmtNb = value;
        return this;
    }

    /**
     * Gets the value of the adjstdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjstdInd() {
        return adjstdInd;
    }

    /**
     * Sets the value of the adjstdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalAgreement1 setAdjstdInd(Boolean value) {
        this.adjstdInd = value;
        return this;
    }

    /**
     * Gets the value of the rntlLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getRntlLctn() {
        return rntlLctn;
    }

    /**
     * Sets the value of the rntlLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public VehicleRentalAgreement1 setRntlLctn(Address1 value) {
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
     * {@link Address1 }
     * 
     * 
     * @return
     *     The value of the pckpLctn property.
     */
    public List<Address1> getPckpLctn() {
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
    public VehicleRentalAgreement1 setChckOutDt(LocalDate value) {
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
    public VehicleRentalAgreement1 setChckOutTm(OffsetTime value) {
        this.chckOutTm = value;
        return this;
    }

    /**
     * Gets the value of the rtrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getRtrLctn() {
        return rtrLctn;
    }

    /**
     * Sets the value of the rtrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public VehicleRentalAgreement1 setRtrLctn(Address1 value) {
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
    public VehicleRentalAgreement1 setChckInDt(LocalDate value) {
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
    public VehicleRentalAgreement1 setChckInTm(OffsetTime value) {
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
    public VehicleRentalAgreement1 setDrtn(String value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the vhclClssDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle4 }
     *     
     */
    public Vehicle4 getVhclClssDtls() {
        return vhclClssDtls;
    }

    /**
     * Sets the value of the vhclClssDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle4 }
     *     
     */
    public VehicleRentalAgreement1 setVhclClssDtls(Vehicle4 value) {
        this.vhclClssDtls = value;
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
    public VehicleRentalAgreement1 setTrvlDstnc(Distance1 value) {
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
     * {@link RentalRate1 }
     * 
     * 
     * @return
     *     The value of the rntlRate property.
     */
    public List<RentalRate1> getRntlRate() {
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
     *     {@link RentalDetails1 }
     *     
     */
    public RentalDetails1 getRntlDtls() {
        return rntlDtls;
    }

    /**
     * Sets the value of the rntlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RentalDetails1 }
     *     
     */
    public VehicleRentalAgreement1 setRntlDtls(RentalDetails1 value) {
        this.rntlDtls = value;
        return this;
    }

    /**
     * Gets the value of the vhclRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclRegnNb() {
        return vhclRegnNb;
    }

    /**
     * Sets the value of the vhclRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalAgreement1 setVhclRegnNb(String value) {
        this.vhclRegnNb = value;
        return this;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalAgreement1 setInsrncInd(Boolean value) {
        this.insrncInd = value;
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
     * {@link Amount9 }
     * 
     * 
     * @return
     *     The value of the addtlAmt property.
     */
    public List<Amount9> getAddtlAmt() {
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
     * {@link Tax33 }
     * 
     * 
     * @return
     *     The value of the estmtdTax property.
     */
    public List<Tax33> getEstmtdTax() {
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
     * {@link LoyaltyProgramme1 }
     * 
     * 
     * @return
     *     The value of the lltyPrgrmm property.
     */
    public List<LoyaltyProgramme1> getLltyPrgrmm() {
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
    public VehicleRentalAgreement1 addPckpLctn(Address1 pckpLctn) {
        getPckpLctn().add(pckpLctn);
        return this;
    }

    /**
     * Adds a new item to the rntlRate list.
     * @see #getRntlRate()
     * 
     */
    public VehicleRentalAgreement1 addRntlRate(RentalRate1 rntlRate) {
        getRntlRate().add(rntlRate);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public VehicleRentalAgreement1 addAddtlAmt(Amount9 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the estmtdTax list.
     * @see #getEstmtdTax()
     * 
     */
    public VehicleRentalAgreement1 addEstmtdTax(Tax33 estmtdTax) {
        getEstmtdTax().add(estmtdTax);
        return this;
    }

    /**
     * Adds a new item to the dscntPrgrmm list.
     * @see #getDscntPrgrmm()
     * 
     */
    public VehicleRentalAgreement1 addDscntPrgrmm(Discount3 dscntPrgrmm) {
        getDscntPrgrmm().add(dscntPrgrmm);
        return this;
    }

    /**
     * Adds a new item to the lltyPrgrmm list.
     * @see #getLltyPrgrmm()
     * 
     */
    public VehicleRentalAgreement1 addLltyPrgrmm(LoyaltyProgramme1 lltyPrgrmm) {
        getLltyPrgrmm().add(lltyPrgrmm);
        return this;
    }

}
