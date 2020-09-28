
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
 * Class for seev.024.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "agtCAInfStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.024.001.01")
public class MxSeev02400101
    extends AbstractMX
{

    @XmlElement(name = "AgtCAInfStsAdvc", required = true)
    protected AgentCAInformationStatusAdviceV01 agtCAInfStsAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 24;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AddressType2Code.class, AgentCAInformationStatusAdviceV01 .class, AlternateSecurityIdentification3 .class, BeneficialOwner1 .class, BeneficiaryCertificationType1Code.class, BeneficiaryCertificationType1FormatChoice.class, CashAccountIdentification1Choice.class, CorporateActionAdditionalInformation1 .class, CorporateActionInformationProcessingStatus1 .class, CorporateActionInformationRejectedStatus1 .class, CorporateActionInformationStatus1Choice.class, DocumentIdentification8 .class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification16 .class, MxSeev02400101 .class, NameAndAddress5 .class, PartyIdentification2Choice.class, PersonIdentificationType3Choice.class, PersonIdentificationType3Code.class, PostalAddress1 .class, ProceedsDelivery1 .class, ProcessedStatus5Code.class, ProcessedStatus5FormatChoice.class, RejectionReason15Code.class, RejectionReason15FormatChoice.class, SecurityIdentification7 .class, SimpleIdentificationInformation.class, UnitOrFaceAmount1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.024.001.01";

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
    public static MxSeev02400101 parse(String xml) {
        return ((MxSeev02400101) MxReadImpl.parse(MxSeev02400101 .class, xml, _classes));
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
    public final static MxSeev02400101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSeev02400101 .class);
    }

}
