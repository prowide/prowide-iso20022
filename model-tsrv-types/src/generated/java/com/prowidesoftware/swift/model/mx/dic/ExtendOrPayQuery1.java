
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Undertaking extend or pay query details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendOrPayQuery1", propOrder = {
    "udrtkgId",
    "dmndDtls",
    "reqdXpryDt",
    "bkInstrs",
    "bkCtct",
    "nclsdFile",
    "addtlInf"
})
public class ExtendOrPayQuery1 {

    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking9 udrtkgId;
    @XmlElement(name = "DmndDtls", required = true)
    protected Demand2 dmndDtls;
    @XmlElement(name = "ReqdXpryDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdXpryDt;
    @XmlElement(name = "BkInstrs")
    protected BankInstructions1 bkInstrs;
    @XmlElement(name = "BkCtct")
    protected List<Contacts3> bkCtct;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking9 }
     *     
     */
    public Undertaking9 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking9 }
     *     
     */
    public ExtendOrPayQuery1 setUdrtkgId(Undertaking9 value) {
        this.udrtkgId = value;
        return this;
    }

    /**
     * Gets the value of the dmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand2 }
     *     
     */
    public Demand2 getDmndDtls() {
        return dmndDtls;
    }

    /**
     * Sets the value of the dmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand2 }
     *     
     */
    public ExtendOrPayQuery1 setDmndDtls(Demand2 value) {
        this.dmndDtls = value;
        return this;
    }

    /**
     * Gets the value of the reqdXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public ExtendOrPayQuery1 setReqdXpryDt(XMLGregorianCalendar value) {
        this.reqdXpryDt = value;
        return this;
    }

    /**
     * Gets the value of the bkInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link BankInstructions1 }
     *     
     */
    public BankInstructions1 getBkInstrs() {
        return bkInstrs;
    }

    /**
     * Sets the value of the bkInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInstructions1 }
     *     
     */
    public ExtendOrPayQuery1 setBkInstrs(BankInstructions1 value) {
        this.bkInstrs = value;
        return this;
    }

    /**
     * Gets the value of the bkCtct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bkCtct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkCtct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contacts3 }
     * 
     * 
     */
    public List<Contacts3> getBkCtct() {
        if (bkCtct == null) {
            bkCtct = new ArrayList<Contacts3>();
        }
        return this.bkCtct;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<Document9>();
        }
        return this.nclsdFile;
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
     * Adds a new item to the bkCtct list.
     * @see #getBkCtct()
     * 
     */
    public ExtendOrPayQuery1 addBkCtct(Contacts3 bkCtct) {
        getBkCtct().add(bkCtct);
        return this;
    }

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public ExtendOrPayQuery1 addNclsdFile(Document9 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public ExtendOrPayQuery1 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
