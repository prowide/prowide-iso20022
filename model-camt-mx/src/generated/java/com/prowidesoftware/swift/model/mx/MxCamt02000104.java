
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
 * Class for camt.020.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getGnlBizInf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.020.001.04")
public class MxCamt02000104
    extends AbstractMX
{

    @XmlElement(name = "GetGnlBizInf", required = true)
    protected GetGeneralBusinessInformationV04 getGnlBizInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BusinessInformationCriteria1 .class, BusinessInformationQueryDefinition3 .class, CharacterSearch1Choice.class, GeneralBusinessInformationCriteriaDefinition1Choice.class, GeneralBusinessInformationReturnCriteria1 .class, GeneralBusinessInformationSearchCriteria1 .class, GetGeneralBusinessInformationV04 .class, InformationQualifierType1 .class, MessageHeader1 .class, MxCamt02000104 .class, Priority1Code.class, QueryType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.020.001.04";

    public MxCamt02000104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02000104(final String xml) {
        this();
        MxCamt02000104 tmp = parse(xml);
        getGnlBizInf = tmp.getGetGnlBizInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02000104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getGnlBizInf property.
     * 
     * @return
     *     possible object is
     *     {@link GetGeneralBusinessInformationV04 }
     *     
     */
    public GetGeneralBusinessInformationV04 getGetGnlBizInf() {
        return getGnlBizInf;
    }

    /**
     * Sets the value of the getGnlBizInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGeneralBusinessInformationV04 }
     *     
     */
    public MxCamt02000104 setGetGnlBizInf(GetGeneralBusinessInformationV04 value) {
        this.getGnlBizInf = value;
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
    public static MxCamt02000104 parse(String xml) {
        return ((MxCamt02000104) MxReadImpl.parse(MxCamt02000104 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02000104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02000104) parserImpl.read(MxCamt02000104 .class, xml, _classes));
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
     * Creates an MxCamt02000104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02000104 message
     * @return
     *     a new instance of MxCamt02000104
     */
    public final static MxCamt02000104 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt02000104 .class);
    }

}
