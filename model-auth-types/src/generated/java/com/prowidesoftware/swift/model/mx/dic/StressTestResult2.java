
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information on the results of the last stress tests performed by the fund to identify possible events or future changes in economic conditions which should have unfavourable effects on the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StressTestResult2", propOrder = {
    "strssTstDt",
    "strssTstFctrTp",
    "netAsstValBsis",
    "strssTstScnroCd",
    "strssTstImpct",
    "inptFctr",
    "cmnt"
})
public class StressTestResult2 {

    @XmlElement(name = "StrssTstDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar strssTstDt;
    @XmlElement(name = "StrssTstFctrTp")
    protected String strssTstFctrTp;
    @XmlElement(name = "NetAsstValBsis")
    @XmlSchemaType(name = "string")
    protected NetAssetValueBasis1Code netAsstValBsis;
    @XmlElement(name = "StrssTstScnroCd", required = true)
    protected String strssTstScnroCd;
    @XmlElement(name = "StrssTstImpct")
    protected StressTestImpact1Choice strssTstImpct;
    @XmlElement(name = "InptFctr")
    protected BigDecimal inptFctr;
    @XmlElement(name = "Cmnt")
    protected String cmnt;

    /**
     * Gets the value of the strssTstDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStrssTstDt() {
        return strssTstDt;
    }

    /**
     * Sets the value of the strssTstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StressTestResult2 setStrssTstDt(XMLGregorianCalendar value) {
        this.strssTstDt = value;
        return this;
    }

    /**
     * Gets the value of the strssTstFctrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrssTstFctrTp() {
        return strssTstFctrTp;
    }

    /**
     * Sets the value of the strssTstFctrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StressTestResult2 setStrssTstFctrTp(String value) {
        this.strssTstFctrTp = value;
        return this;
    }

    /**
     * Gets the value of the netAsstValBsis property.
     * 
     * @return
     *     possible object is
     *     {@link NetAssetValueBasis1Code }
     *     
     */
    public NetAssetValueBasis1Code getNetAsstValBsis() {
        return netAsstValBsis;
    }

    /**
     * Sets the value of the netAsstValBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetAssetValueBasis1Code }
     *     
     */
    public StressTestResult2 setNetAsstValBsis(NetAssetValueBasis1Code value) {
        this.netAsstValBsis = value;
        return this;
    }

    /**
     * Gets the value of the strssTstScnroCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrssTstScnroCd() {
        return strssTstScnroCd;
    }

    /**
     * Sets the value of the strssTstScnroCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StressTestResult2 setStrssTstScnroCd(String value) {
        this.strssTstScnroCd = value;
        return this;
    }

    /**
     * Gets the value of the strssTstImpct property.
     * 
     * @return
     *     possible object is
     *     {@link StressTestImpact1Choice }
     *     
     */
    public StressTestImpact1Choice getStrssTstImpct() {
        return strssTstImpct;
    }

    /**
     * Sets the value of the strssTstImpct property.
     * 
     * @param value
     *     allowed object is
     *     {@link StressTestImpact1Choice }
     *     
     */
    public StressTestResult2 setStrssTstImpct(StressTestImpact1Choice value) {
        this.strssTstImpct = value;
        return this;
    }

    /**
     * Gets the value of the inptFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInptFctr() {
        return inptFctr;
    }

    /**
     * Sets the value of the inptFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public StressTestResult2 setInptFctr(BigDecimal value) {
        this.inptFctr = value;
        return this;
    }

    /**
     * Gets the value of the cmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnt() {
        return cmnt;
    }

    /**
     * Sets the value of the cmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StressTestResult2 setCmnt(String value) {
        this.cmnt = value;
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

}
