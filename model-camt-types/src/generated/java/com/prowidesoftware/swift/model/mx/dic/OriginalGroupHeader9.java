
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details on the original group, to which the message refers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalGroupHeader9", propOrder = {
    "orgnlGrpCxlId",
    "rslvdCase",
    "orgnlMsgId",
    "orgnlMsgNmId",
    "orgnlCreDtTm",
    "orgnlNbOfTxs",
    "orgnlCtrlSum",
    "grpCxlSts",
    "cxlStsRsnInf",
    "nbOfTxsPerCxlSts"
})
public class OriginalGroupHeader9 {

    @XmlElement(name = "OrgnlGrpCxlId")
    protected String orgnlGrpCxlId;
    @XmlElement(name = "RslvdCase")
    protected Case4 rslvdCase;
    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgnlMsgNmId;
    @XmlElement(name = "OrgnlCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgnlCreDtTm;
    @XmlElement(name = "OrgnlNbOfTxs")
    protected String orgnlNbOfTxs;
    @XmlElement(name = "OrgnlCtrlSum")
    protected BigDecimal orgnlCtrlSum;
    @XmlElement(name = "GrpCxlSts")
    @XmlSchemaType(name = "string")
    protected GroupCancellationStatus1Code grpCxlSts;
    @XmlElement(name = "CxlStsRsnInf")
    protected List<CancellationStatusReason3> cxlStsRsnInf;
    @XmlElement(name = "NbOfTxsPerCxlSts")
    protected List<NumberOfTransactionsPerStatus1> nbOfTxsPerCxlSts;

    /**
     * Gets the value of the orgnlGrpCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlGrpCxlId() {
        return orgnlGrpCxlId;
    }

    /**
     * Sets the value of the orgnlGrpCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader9 setOrgnlGrpCxlId(String value) {
        this.orgnlGrpCxlId = value;
        return this;
    }

    /**
     * Gets the value of the rslvdCase property.
     * 
     * @return
     *     possible object is
     *     {@link Case4 }
     *     
     */
    public Case4 getRslvdCase() {
        return rslvdCase;
    }

    /**
     * Sets the value of the rslvdCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case4 }
     *     
     */
    public OriginalGroupHeader9 setRslvdCase(Case4 value) {
        this.rslvdCase = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader9 setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader9 setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader9 setOrgnlCreDtTm(XMLGregorianCalendar value) {
        this.orgnlCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNbOfTxs() {
        return orgnlNbOfTxs;
    }

    /**
     * Sets the value of the orgnlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalGroupHeader9 setOrgnlNbOfTxs(String value) {
        this.orgnlNbOfTxs = value;
        return this;
    }

    /**
     * Gets the value of the orgnlCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlCtrlSum() {
        return orgnlCtrlSum;
    }

    /**
     * Sets the value of the orgnlCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OriginalGroupHeader9 setOrgnlCtrlSum(BigDecimal value) {
        this.orgnlCtrlSum = value;
        return this;
    }

    /**
     * Gets the value of the grpCxlSts property.
     * 
     * @return
     *     possible object is
     *     {@link GroupCancellationStatus1Code }
     *     
     */
    public GroupCancellationStatus1Code getGrpCxlSts() {
        return grpCxlSts;
    }

    /**
     * Sets the value of the grpCxlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupCancellationStatus1Code }
     *     
     */
    public OriginalGroupHeader9 setGrpCxlSts(GroupCancellationStatus1Code value) {
        this.grpCxlSts = value;
        return this;
    }

    /**
     * Gets the value of the cxlStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cxlStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancellationStatusReason3 }
     * 
     * 
     */
    public List<CancellationStatusReason3> getCxlStsRsnInf() {
        if (cxlStsRsnInf == null) {
            cxlStsRsnInf = new ArrayList<CancellationStatusReason3>();
        }
        return this.cxlStsRsnInf;
    }

    /**
     * Gets the value of the nbOfTxsPerCxlSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nbOfTxsPerCxlSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfTxsPerCxlSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerStatus1 }
     * 
     * 
     */
    public List<NumberOfTransactionsPerStatus1> getNbOfTxsPerCxlSts() {
        if (nbOfTxsPerCxlSts == null) {
            nbOfTxsPerCxlSts = new ArrayList<NumberOfTransactionsPerStatus1>();
        }
        return this.nbOfTxsPerCxlSts;
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
     * Adds a new item to the cxlStsRsnInf list.
     * @see #getCxlStsRsnInf()
     * 
     */
    public OriginalGroupHeader9 addCxlStsRsnInf(CancellationStatusReason3 cxlStsRsnInf) {
        getCxlStsRsnInf().add(cxlStsRsnInf);
        return this;
    }

    /**
     * Adds a new item to the nbOfTxsPerCxlSts list.
     * @see #getNbOfTxsPerCxlSts()
     * 
     */
    public OriginalGroupHeader9 addNbOfTxsPerCxlSts(NumberOfTransactionsPerStatus1 nbOfTxsPerCxlSts) {
        getNbOfTxsPerCxlSts().add(nbOfTxsPerCxlSts);
        return this;
    }

}
