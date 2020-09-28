
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.013.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getMmb"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.013.001.04")
public class MxCamt01300104
    extends AbstractMX
{

    @XmlElement(name = "GetMmb", required = true)
    protected GetMemberV04 getMmb;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 13;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, FinancialIdentificationSchemeName1Choice.class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GetMemberV04 .class, MemberCriteria4 .class, MemberCriteriaDefinition2Choice.class, MemberIdentification3Choice.class, MemberQueryDefinition4 .class, MemberReturnCriteria1 .class, MemberSearchCriteria4 .class, MemberStatus1Code.class, MessageHeader9 .class, MxCamt01300104 .class, QueryType2Code.class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemMemberStatus1Choice.class, SystemMemberType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.013.001.04";

    public MxCamt01300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt01300104(final String xml) {
        this();
        MxCamt01300104 tmp = parse(xml);
        getMmb = tmp.getGetMmb();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt01300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getMmb property.
     * 
     * @return
     *     possible object is
     *     {@link GetMemberV04 }
     *     
     */
    public GetMemberV04 getGetMmb() {
        return getMmb;
    }

    /**
     * Sets the value of the getMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMemberV04 }
     *     
     */
    public MxCamt01300104 setGetMmb(GetMemberV04 value) {
        this.getMmb = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxCamt01300104 parse(String xml) {
        return ((MxCamt01300104) MxReadImpl.parse(MxCamt01300104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt01300104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt01300104) parserImpl.read(MxCamt01300104 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxCamt01300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt01300104 message
     * @return
     *     a new instance of MxCamt01300104
     */
    public final static MxCamt01300104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt01300104 .class);
    }

}
