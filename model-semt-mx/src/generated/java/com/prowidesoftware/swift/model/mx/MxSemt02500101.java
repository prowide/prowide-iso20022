
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.025.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesAcctPosQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT5semt.025.001.01")
public class MxSemt02500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesAcctPosQry", required = true)
    protected SecuritiesAccountPositionQueryV01 sctiesAcctPosQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 25;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {DateAndDateTimeChoice1Draft.class, DateAndPeriod1Choice1 .class, GenericIdentification301Draft.class, MxSemt02500101 .class, PartyIdentification1001 .class, PartyIdentification71Choice1 .class, Period21 .class, Period2Choice1 .class, PositionSearchCriteria21 .class, SecuritiesAccount191 .class, SecuritiesAccount2Choice1 .class, SecuritiesAccountPositionQueryV01 .class, SecuritiesBalanceType13Code1 .class, SecuritiesBalanceType7Choice1 .class, SecurityIdentification191 .class, Statement571 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT5semt.025.001.01";

    public MxSemt02500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02500101(final String xml) {
        this();
        MxSemt02500101 tmp = parse(xml);
        sctiesAcctPosQry = tmp.getSctiesAcctPosQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesAcctPosQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountPositionQueryV01 }
     *     
     */
    public SecuritiesAccountPositionQueryV01 getSctiesAcctPosQry() {
        return sctiesAcctPosQry;
    }

    /**
     * Sets the value of the sctiesAcctPosQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountPositionQueryV01 }
     *     
     */
    public MxSemt02500101 setSctiesAcctPosQry(SecuritiesAccountPositionQueryV01 value) {
        this.sctiesAcctPosQry = value;
        return this;
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
    public static MxSemt02500101 parse(String xml) {
        return ((MxSemt02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02500101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02500101) parserImpl.read(MxSemt02500101 .class, xml, _classes));
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
     * Creates an MxSemt02500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02500101 message
     * @return
     *     a new instance of MxSemt02500101
     */
    public static final MxSemt02500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02500101 .class);
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
