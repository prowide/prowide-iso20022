
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.020.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getGnlBizInf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.020.001.03")
public class MxCamt02000103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetGnlBizInf", required = true)
    protected GetGeneralBusinessInformationV03 getGnlBizInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 20;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {BusinessInformationCriteria1 .class, BusinessInformationQueryDefinition3 .class, CharacterSearch1Choice.class, GeneralBusinessInformationCriteriaDefinition1Choice.class, GeneralBusinessInformationReturnCriteria1 .class, GeneralBusinessInformationSearchCriteria1 .class, GetGeneralBusinessInformationV03 .class, InformationQualifierType1 .class, MessageHeader1 .class, MxCamt02000103 .class, Priority1Code.class, QueryType2Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.020.001.03";

    public MxCamt02000103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02000103(final String xml) {
        this();
        MxCamt02000103 tmp = parse(xml);
        getGnlBizInf = tmp.getGetGnlBizInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02000103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getGnlBizInf property.
     * 
     * @return
     *     possible object is
     *     {@link GetGeneralBusinessInformationV03 }
     *     
     */
    public GetGeneralBusinessInformationV03 getGetGnlBizInf() {
        return getGnlBizInf;
    }

    /**
     * Sets the value of the getGnlBizInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGeneralBusinessInformationV03 }
     *     
     */
    public MxCamt02000103 setGetGnlBizInf(GetGeneralBusinessInformationV03 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt02000103 parse(String xml) {
        return ((MxCamt02000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02000103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02000103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02000103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02000103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02000103) parserImpl.read(MxCamt02000103 .class, xml, _classes));
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
     * Creates an MxCamt02000103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02000103 message
     * @return
     *     a new instance of MxCamt02000103
     */
    public final static MxCamt02000103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02000103 .class);
    }

}
