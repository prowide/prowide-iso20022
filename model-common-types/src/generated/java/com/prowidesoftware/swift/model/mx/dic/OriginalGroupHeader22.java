
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
 * Provides details on the original group, to which the message refers.
=======
 * Provides information on the original group, to which the message refers.
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
@XmlType(name = "OriginalGroupHeader22", propOrder = {
=======
@XmlType(name = "OriginalGroupInformation32", propOrder = {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
    "orgnlMsgId",
    "orgnlMsgNmId",
    "orgnlCreDtTm",
    "orgnlNbOfTxs",
    "orgnlCtrlSum",
    "grpSts",
    "stsRsnInf",
    "nbOfTxsPerSts"
})
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
public class OriginalGroupHeader22 {
=======
public class OriginalGroupInformation32 {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgnlMsgNmId;
    @XmlElement(name = "OrgnlCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    protected OffsetDateTime orgnlCreDtTm;
=======
    protected XMLGregorianCalendar orgnlCreDtTm;
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
    @XmlElement(name = "OrgnlNbOfTxs")
    protected String orgnlNbOfTxs;
    @XmlElement(name = "OrgnlCtrlSum")
    protected BigDecimal orgnlCtrlSum;
    @XmlElement(name = "GrpSts")
    protected String grpSts;
    @XmlElement(name = "StsRsnInf")
    protected List<StatusReasonInformation14> stsRsnInf;
    @XmlElement(name = "NbOfTxsPerSts")
    protected List<NumberOfTransactionsPerStatus5> nbOfTxsPerSts;

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
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 setOrgnlMsgId(String value) {
=======
    public OriginalGroupInformation32 setOrgnlMsgId(String value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
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
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 setOrgnlMsgNmId(String value) {
=======
    public OriginalGroupInformation32 setOrgnlMsgNmId(String value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
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
    public OffsetDateTime getOrgnlCreDtTm() {
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
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 setOrgnlCreDtTm(OffsetDateTime value) {
=======
    public OriginalGroupInformation32 setOrgnlCreDtTm(XMLGregorianCalendar value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
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
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 setOrgnlNbOfTxs(String value) {
=======
    public OriginalGroupInformation32 setOrgnlNbOfTxs(String value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
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
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 setOrgnlCtrlSum(BigDecimal value) {
=======
    public OriginalGroupInformation32 setOrgnlCtrlSum(BigDecimal value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
        this.orgnlCtrlSum = value;
        return this;
    }

    /**
     * Gets the value of the grpSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpSts() {
        return grpSts;
    }

    /**
     * Sets the value of the grpSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 setGrpSts(String value) {
=======
    public OriginalGroupInformation32 setGrpSts(String value) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
        this.grpSts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation14 }
     * 
     * 
     * @return
     *     The value of the stsRsnInf property.
     */
    public List<StatusReasonInformation14> getStsRsnInf() {
        if (stsRsnInf == null) {
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
            stsRsnInf = new ArrayList<>();
=======
            stsRsnInf = new ArrayList<StatusReasonInformation14>();
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
        }
        return this.stsRsnInf;
    }

    /**
     * Gets the value of the nbOfTxsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nbOfTxsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfTxsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfTransactionsPerStatus5 }
     * 
     * 
     * @return
     *     The value of the nbOfTxsPerSts property.
     */
    public List<NumberOfTransactionsPerStatus5> getNbOfTxsPerSts() {
        if (nbOfTxsPerSts == null) {
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
            nbOfTxsPerSts = new ArrayList<>();
=======
            nbOfTxsPerSts = new ArrayList<NumberOfTransactionsPerStatus5>();
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
        }
        return this.nbOfTxsPerSts;
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
     * Adds a new item to the stsRsnInf list.
     * @see #getStsRsnInf()
     * 
     */
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 addStsRsnInf(StatusReasonInformation14 stsRsnInf) {
=======
    public OriginalGroupInformation32 addStsRsnInf(StatusReasonInformation14 stsRsnInf) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
        getStsRsnInf().add(stsRsnInf);
        return this;
    }

    /**
     * Adds a new item to the nbOfTxsPerSts list.
     * @see #getNbOfTxsPerSts()
     * 
     */
<<<<<<< HEAD:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupHeader22.java
    public OriginalGroupHeader22 addNbOfTxsPerSts(NumberOfTransactionsPerStatus5 nbOfTxsPerSts) {
=======
    public OriginalGroupInformation32 addNbOfTxsPerSts(NumberOfTransactionsPerStatus5 nbOfTxsPerSts) {
>>>>>>> origin/main:model-pain-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/OriginalGroupInformation32.java
        getNbOfTxsPerSts().add(nbOfTxsPerSts);
        return this;
    }

}
