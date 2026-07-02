
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
 * Class for semt.030.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesSttlmCondsModReqQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT3semt.030.001.01")
public class MxSemt03000101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesSttlmCondsModReqQry", required = true)
    protected SecuritiesSettlementConditionsModificationRequestQueryV01 sctiesSttlmCondsModReqQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 30;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {DateAndDateTimeSearch2Choice1 .class, DateSearchChoice1 .class, FinancialInstitutionIdentification121 .class, InstructionQueryType1Code.class, IntraPositionQueryCriteria41 .class, IntraPositionQueryDefinition41 .class, ModificationProcessingStatus1Code1 .class, ModificationProcessingStatus9Choice1 .class, MovementResponseType1Code.class, MxSemt03000101 .class, PartyIdentification44Choice1 .class, PartyIdentification911 .class, SecuritiesAccount191 .class, SecuritiesSettlementConditionsModificationRequestQueryV01 .class, SystemPartyIdentification61 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT3semt.030.001.01";

    public MxSemt03000101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt03000101(final String xml) {
        this();
        MxSemt03000101 tmp = parse(xml);
        sctiesSttlmCondsModReqQry = tmp.getSctiesSttlmCondsModReqQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt03000101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesSttlmCondsModReqQry property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementConditionsModificationRequestQueryV01 }
     *     
     */
    public SecuritiesSettlementConditionsModificationRequestQueryV01 getSctiesSttlmCondsModReqQry() {
        return sctiesSttlmCondsModReqQry;
    }

    /**
     * Sets the value of the sctiesSttlmCondsModReqQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementConditionsModificationRequestQueryV01 }
     *     
     */
    public MxSemt03000101 setSctiesSttlmCondsModReqQry(SecuritiesSettlementConditionsModificationRequestQueryV01 value) {
        this.sctiesSttlmCondsModReqQry = value;
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
    public static MxSemt03000101 parse(String xml) {
        return ((MxSemt03000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt03000101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt03000101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt03000101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt03000101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt03000101) parserImpl.read(MxSemt03000101 .class, xml, _classes));
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
     * Creates an MxSemt03000101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt03000101 message
     * @return
     *     a new instance of MxSemt03000101
     */
    public static final MxSemt03000101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt03000101 .class);
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
