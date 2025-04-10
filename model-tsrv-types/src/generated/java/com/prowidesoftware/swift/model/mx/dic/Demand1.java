
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the demand.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Demand1", propOrder = {
    "id",
    "tp",
    "udrtkgId",
    "dmndAmt",
    "advsgPtyRefNb",
    "scndAdvsgPtyRefNb",
    "cnfrmrRefNb",
    "sttlmAcct",
    "presntnDtls",
    "reqdXpryDt",
    "dmndDcmnttn",
    "addtlInf"
})
public class Demand1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected DemandType1Code tp;
    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking6 udrtkgId;
    @XmlElement(name = "DmndAmt", required = true)
    protected UndertakingAmount3 dmndAmt;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "ScndAdvsgPtyRefNb")
    protected String scndAdvsgPtyRefNb;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;
    @XmlElement(name = "SttlmAcct")
    protected List<CashAccount27> sttlmAcct;
    @XmlElement(name = "PresntnDtls")
    protected Presentation2 presntnDtls;
    @XmlElement(name = "ReqdXpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdXpryDt;
    @XmlElement(name = "DmndDcmnttn")
    protected DemandDocumentation1 dmndDcmnttn;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Demand1 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DemandType1Code }
     *     
     */
    public DemandType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandType1Code }
     *     
     */
    public Demand1 setTp(DemandType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking6 }
     *     
     */
    public Undertaking6 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking6 }
     *     
     */
    public Demand1 setUdrtkgId(Undertaking6 value) {
        this.udrtkgId = value;
        return this;
    }

    /**
     * Gets the value of the dmndAmt property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmount3 }
     *     
     */
    public UndertakingAmount3 getDmndAmt() {
        return dmndAmt;
    }

    /**
     * Sets the value of the dmndAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmount3 }
     *     
     */
    public Demand1 setDmndAmt(UndertakingAmount3 value) {
        this.dmndAmt = value;
        return this;
    }

    /**
     * Gets the value of the advsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Sets the value of the advsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Demand1 setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
        return this;
    }

    /**
     * Gets the value of the scndAdvsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndAdvsgPtyRefNb() {
        return scndAdvsgPtyRefNb;
    }

    /**
     * Sets the value of the scndAdvsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Demand1 setScndAdvsgPtyRefNb(String value) {
        this.scndAdvsgPtyRefNb = value;
        return this;
    }

    /**
     * Gets the value of the cnfrmrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Sets the value of the cnfrmrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Demand1 setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount27 }
     * 
     * 
     */
    public List<CashAccount27> getSttlmAcct() {
        if (sttlmAcct == null) {
            sttlmAcct = new ArrayList<CashAccount27>();
        }
        return this.sttlmAcct;
    }

    /**
     * Gets the value of the presntnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Presentation2 }
     *     
     */
    public Presentation2 getPresntnDtls() {
        return presntnDtls;
    }

    /**
     * Sets the value of the presntnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Presentation2 }
     *     
     */
    public Demand1 setPresntnDtls(Presentation2 value) {
        this.presntnDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdXpryDt() {
        return reqdXpryDt;
    }

    /**
     * Sets the value of the reqdXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Demand1 setReqdXpryDt(XMLGregorianCalendar value) {
        this.reqdXpryDt = value;
        return this;
    }

    /**
     * Gets the value of the dmndDcmnttn property.
     * 
     * @return
     *     possible object is
     *     {@link DemandDocumentation1 }
     *     
     */
    public DemandDocumentation1 getDmndDcmnttn() {
        return dmndDcmnttn;
    }

    /**
     * Sets the value of the dmndDcmnttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandDocumentation1 }
     *     
     */
    public Demand1 setDmndDcmnttn(DemandDocumentation1 value) {
        this.dmndDcmnttn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
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
     * Adds a new item to the sttlmAcct list.
     * @see #getSttlmAcct()
     * 
     */
    public Demand1 addSttlmAcct(CashAccount27 sttlmAcct) {
        getSttlmAcct().add(sttlmAcct);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Demand1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
