
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
 * Details of the advice for the issuance of an undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAdvice2", propOrder = {
    "applcntRefNb",
    "oblgr",
    "udrtkgIssncMsg",
    "orgnlIssdMdm",
    "nclsdFile",
    "addtlInf"
})
public class UndertakingAdvice2 {

    @XmlElement(name = "ApplcntRefNb", required = true)
    protected String applcntRefNb;
    @XmlElement(name = "Oblgr")
    protected PartyIdentification43 oblgr;
    @XmlElement(name = "UdrtkgIssncMsg", required = true)
    protected UndertakingIssuanceMessage udrtkgIssncMsg;
    @XmlElement(name = "OrgnlIssdMdm")
    @XmlSchemaType(name = "string")
    protected PresentationMedium1Code orgnlIssdMdm;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Gets the value of the applcntRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntRefNb() {
        return applcntRefNb;
    }

    /**
     * Sets the value of the applcntRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingAdvice2 setApplcntRefNb(String value) {
        this.applcntRefNb = value;
        return this;
    }

    /**
     * Gets the value of the oblgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getOblgr() {
        return oblgr;
    }

    /**
     * Sets the value of the oblgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public UndertakingAdvice2 setOblgr(PartyIdentification43 value) {
        this.oblgr = value;
        return this;
    }

    /**
     * Gets the value of the udrtkgIssncMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingIssuanceMessage }
     *     
     */
    public UndertakingIssuanceMessage getUdrtkgIssncMsg() {
        return udrtkgIssncMsg;
    }

    /**
     * Sets the value of the udrtkgIssncMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingIssuanceMessage }
     *     
     */
    public UndertakingAdvice2 setUdrtkgIssncMsg(UndertakingIssuanceMessage value) {
        this.udrtkgIssncMsg = value;
        return this;
    }

    /**
     * Gets the value of the orgnlIssdMdm property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationMedium1Code }
     *     
     */
    public PresentationMedium1Code getOrgnlIssdMdm() {
        return orgnlIssdMdm;
    }

    /**
     * Sets the value of the orgnlIssdMdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationMedium1Code }
     *     
     */
    public UndertakingAdvice2 setOrgnlIssdMdm(PresentationMedium1Code value) {
        this.orgnlIssdMdm = value;
        return this;
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
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public UndertakingAdvice2 addNclsdFile(Document9 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public UndertakingAdvice2 addAddtlInf(String addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
