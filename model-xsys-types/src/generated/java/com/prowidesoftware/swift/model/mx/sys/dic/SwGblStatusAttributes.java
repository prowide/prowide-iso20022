
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for StatusAttributes complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAttributes", namespace = "urn:swift:snl:ns.SwGbl", propOrder = {
    "severity",
    "code",
    "parameter",
    "text",
    "action",
    "details"
})
public class SwGblStatusAttributes {

    @XmlElement(name = "Severity", required = true)
    protected String severity;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Parameter")
    protected List<SwGblMixedAny> parameter;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Action")
    protected String action;
    @XmlElement(name = "Details")
    protected List<SwGblDetails> details;

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGblStatusAttributes setSeverity(String value) {
        this.severity = value;
        return this;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGblStatusAttributes setCode(String value) {
        this.code = value;
        return this;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwGblMixedAny }
     * 
     * 
     */
    public List<SwGblMixedAny> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<SwGblMixedAny>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGblStatusAttributes setText(String value) {
        this.text = value;
        return this;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwGblStatusAttributes setAction(String value) {
        this.action = value;
        return this;
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwGblDetails }
     * 
     * 
     */
    public List<SwGblDetails> getDetails() {
        if (details == null) {
            details = new ArrayList<SwGblDetails>();
        }
        return this.details;
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
     * Adds a new item to the parameter list.
     * @see #getParameter()
     * 
     */
    public SwGblStatusAttributes addParameter(SwGblMixedAny parameter) {
        getParameter().add(parameter);
        return this;
    }

    /**
     * Adds a new item to the details list.
     * @see #getDetails()
     * 
     */
    public SwGblStatusAttributes addDetails(SwGblDetails details) {
        getDetails().add(details);
        return this;
    }

}
