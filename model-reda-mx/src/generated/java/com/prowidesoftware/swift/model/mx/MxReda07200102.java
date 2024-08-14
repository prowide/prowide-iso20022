
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for reda.072.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqToPayDbtrActvtnCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.072.001.02")
public class MxReda07200102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqToPayDbtrActvtnCxlReq", required = true)
    protected RequestToPayDebtorActivationCancellationRequestV02 reqToPayDbtrActvtnCxlReq;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 72;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActivationHeader3 .class, AddressType2Code.class, AddressType3Choice.class, Contact13 .class, ContractReference1 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DebtorActivation5 .class, DebtorActivationCancellation3 .class, DebtorActivationCancellationReason1Choice.class, DebtorActivationCancellationReason3 .class, DocumentFormat2Choice.class, DocumentType1Choice.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, MxReda07200102 .class, NamePrefix2Code.class, OrganisationIdentification40 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalActivation3Choice.class, OriginalBusinessInstruction1 .class, OtherContact1 .class, Party53Choice.class, PersonIdentification20 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, RTPPartyIdentification2 .class, RequestToPayDebtorActivationCancellationRequestV02 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.072.001.02";

    public MxReda07200102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda07200102(final String xml) {
        this();
        MxReda07200102 tmp = parse(xml);
        reqToPayDbtrActvtnCxlReq = tmp.getReqToPayDbtrActvtnCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda07200102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqToPayDbtrActvtnCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link RequestToPayDebtorActivationCancellationRequestV02 }
     *     
     */
    public RequestToPayDebtorActivationCancellationRequestV02 getReqToPayDbtrActvtnCxlReq() {
        return reqToPayDbtrActvtnCxlReq;
    }

    /**
     * Sets the value of the reqToPayDbtrActvtnCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestToPayDebtorActivationCancellationRequestV02 }
     *     
     */
    public MxReda07200102 setReqToPayDbtrActvtnCxlReq(RequestToPayDebtorActivationCancellationRequestV02 value) {
        this.reqToPayDbtrActvtnCxlReq = value;
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
    public static MxReda07200102 parse(String xml) {
        return ((MxReda07200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda07200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda07200102 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda07200102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda07200102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda07200102 parse(String xml, MxRead parserImpl) {
        return ((MxReda07200102) parserImpl.read(MxReda07200102 .class, xml, _classes));
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
     * Creates an MxReda07200102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda07200102 message
     * @return
     *     a new instance of MxReda07200102
     */
    public final static MxReda07200102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda07200102 .class);
    }

}
