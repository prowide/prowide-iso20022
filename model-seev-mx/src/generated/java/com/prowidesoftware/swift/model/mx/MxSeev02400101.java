
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.024.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAInfStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.024.001.01")
public class MxSeev02400101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AgtCAInfStsAdvc", required = true)
    protected AgentCAInformationStatusAdviceV01 agtCAInfStsAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 24;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCAInformationStatusAdviceV01 .class, AlternateSecurityIdentification3 .class, BeneficialOwner1 .class, BeneficiaryCertificationType1Code.class, BeneficiaryCertificationType1FormatChoice.class, CashAccountIdentification1Choice.class, CorporateActionAdditionalInformation1 .class, CorporateActionInformationProcessingStatus1 .class, CorporateActionInformationRejectedStatus1 .class, CorporateActionInformationStatus1Choice.class, DocumentIdentification8 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification16 .class, MxSeev02400101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PersonIdentificationType3Choice.class, PersonIdentificationType3Code.class, PostalAddress1 .class, ProceedsDelivery1 .class, ProcessedStatus5Code.class, ProcessedStatus5FormatChoice.class, RejectionReason15Code.class, RejectionReason15FormatChoice.class, SecurityIdentification7 .class, SimpleIdentificationInformation.class, UnitOrFaceAmount1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.024.001.01";

    public MxSeev02400101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev02400101(final String xml) {
        this();
        MxSeev02400101 tmp = parse(xml);
        agtCAInfStsAdvc = tmp.getAgtCAInfStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev02400101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the agtCAInfStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AgentCAInformationStatusAdviceV01 }
     *     
     */
    public AgentCAInformationStatusAdviceV01 getAgtCAInfStsAdvc() {
        return agtCAInfStsAdvc;
    }

    /**
     * Sets the value of the agtCAInfStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentCAInformationStatusAdviceV01 }
     *     
     */
    public MxSeev02400101 setAgtCAInfStsAdvc(AgentCAInformationStatusAdviceV01 value) {
        this.agtCAInfStsAdvc = value;
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
    public static MxSeev02400101 parse(String xml) {
        return ((MxSeev02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev02400101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev02400101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev02400101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev02400101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev02400101) parserImpl.read(MxSeev02400101 .class, xml, _classes));
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
     * Creates an MxSeev02400101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev02400101 message
     * @return
     *     a new instance of MxSeev02400101
     */
    public static final MxSeev02400101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev02400101 .class);
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
